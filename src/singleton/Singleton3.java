package singleton;

/**
 * 单例模式
 * 懒汉式，线程同步
 *
 * @author Administrator
 * @since 2020-02-05
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }

        return instance;
    }

}
