package prototype.deepclone;

import java.io.*;

/**
 * 用户类
 *
 * @author Administrator
 */
public class User implements Cloneable, Serializable {
    private int id;
    private String username;
    private Address address;

    public User() {
    }

    public User(int id, String username, Address address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() {
        User user = null;

        try {
            //克隆值
            user = (User) super.clone();
            //克隆引用对象
            user.setAddress((Address) address.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 序列化实现深拷贝
     * Object输出到流，再通过流读取，实现复制一个新的对象
     *
     * @return User
     */
    public User deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        User user = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            user = (User) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return user;
    }
}
