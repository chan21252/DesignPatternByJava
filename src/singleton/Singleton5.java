package singleton;

/**
 * 单例模式
 * 静态内部类，手动控制类加载时机，创建单例对象
 *
 * @author Administrator
 * @since 2020-02-05
 */
public class Singleton5 {

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private final static Singleton5 INSTANCE = new Singleton5();
    }
}
