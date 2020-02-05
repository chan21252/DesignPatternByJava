package test;

import org.junit.Assert;
import org.junit.Test;
import singleton.*;

/**
 * 单例模式测试
 *
 * @author Administrator
 */
public class SingletonTest {

    @Test
    public void testSingleton1() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testSingleton2() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testSingleton3() {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testSingleton4() {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testSingleton5() {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testSingleton6() {
        Singleton6 instance1 = Singleton6.INSTANCE;
        Singleton6 instance2 = Singleton6.INSTANCE;
        Assert.assertEquals(instance1, instance2);
        instance1.ok();
    }
}
