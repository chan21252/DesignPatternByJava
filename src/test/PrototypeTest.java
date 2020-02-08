package test;

import org.junit.Assert;
import org.junit.Test;
import prototype.clone.Sheep;
import prototype.deepclone.Address;
import prototype.deepclone.User;

public class PrototypeTest {

    @Test
    public void testCloneSheep() {
        Sheep sheep = new Sheep("tom", "白色", 1);
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep1);
        Assert.assertEquals(sheep1.toString(), sheep.toString());
    }

    @Test
    public void testDeepClone1() {
        Address address = new Address("江苏", "无锡");
        User user = new User(1, "Bob", address);
        User userClone = (User) user.clone();

        System.out.println(userClone);
        System.out.println(user.getAddress().hashCode());
        System.out.println(userClone.getAddress().hashCode());
        Assert.assertEquals(user.toString(), userClone.toString());
        Assert.assertNotEquals(user.getAddress().hashCode(), userClone.getAddress().hashCode());
    }

    @Test
    public void testDeepClone2() {
        Address address = new Address("江苏", "无锡");
        User user = new User(1, "Bob", address);
        User userClone = user.deepClone();
        Assert.assertEquals(user.toString(), userClone.toString());
        Assert.assertNotEquals(user.getAddress().hashCode(), userClone.getAddress().hashCode());
    }
}
