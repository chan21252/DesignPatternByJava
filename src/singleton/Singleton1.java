package singleton;

/**
 * 单例模式
 * 饿汉式，静态常量
 *
 * @author Administrator
 * @since 2020-02-05
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
