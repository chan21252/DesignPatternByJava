package principle.inversion;

/**
 * 信息接收器接口
 */
interface Receiver {
    String getInfo();
}

/**
 * 依赖倒置原则
 * （1）通过接口传递、构造器参数、setter方法传递依赖，而不是直接创建依赖对象
 * （2）不依赖具体细节，依赖抽象
 *
 * @author Administrator
 * @since 2020-02-03
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Receiver email = new Email();
        Receiver weixin = new WeiXin();
        Person person = new Person(email);
        person.receiveInfo();
        person.setReceiver(weixin);
        person.receiveInfo();
    }
}

class Email implements Receiver {
    @Override
    public String getInfo() {
        return "收到邮件";
    }
}

class WeiXin implements Receiver {

    @Override
    public String getInfo() {
        return "收到微信信息";
    }
}

//接口传递
//class Person {
//    public void receiveInfo(Receiver receiver) {
//        System.out.println(receiver.getInfo());
//    }
//}

/**
 * 构造器传祺依赖
 * 设置方法传递依赖
 */
class Person {
    private Receiver receiver;

    public Person(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void receiveInfo() {
        System.out.println(receiver.getInfo());
    }
}