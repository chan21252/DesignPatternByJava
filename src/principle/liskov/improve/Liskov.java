package principle.liskov.improve;

/**
 * 里氏替换原则：
 * 程序中使用父类对象的地方，替换成子类对象，程序运行结果不变
 *
 * @author Administrator
 * @since 2020-02-04
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3 + 8 = " + a.func1(3, 8));
        System.out.println("1 + 6 = " + a.func1(1, 6));

        B b = new B();
        System.out.println("3 + 8 = " + b.func1(3, 8));
        System.out.println("1 + 6 = " + b.func1(1, 6));
        System.out.println("1 + 6 + 9 = " + b.func2(1, 6));
    }
}

/**
 * 抽象出更一般的基类
 */
class Base {
}


/**
 * A类继承基类，并实现加法
 */
class A extends Base {
    public int func1(int n, int m) {
        return n + m;
    }
}


/**
 * B类继承基类，加法依赖A类，实现减法
 */
class B extends Base {
    private A a = new A();

    public int func1(int n, int m) {
        return a.func1(n, m);
    }

    public int func2(int n, int m) {
        return func1(n, m) + 9;
    }

    public int func3(int n, int m) {
        return n - m;
    }
}
