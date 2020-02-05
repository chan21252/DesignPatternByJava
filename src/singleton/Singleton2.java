package singleton;

/**
 * 单例模式
 * 饿汉式，静态代码块
 *
 * @author Administrator
 * @since 2020-02-05
 */
public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
        ;
    }

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
