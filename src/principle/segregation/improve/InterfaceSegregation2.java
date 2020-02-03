package principle.segregation.improve;

interface Interface1 {
    void m1();

    void m2();

    void m3();

    void m4();

    void m5();
}

/**
 * 接口隔离原则：
 * 一个类不应该依赖它不需要的接口
 * 一个类对另一个类的依赖应该建立在最小依赖的基础上
 *
 * @author Administrator
 * @since 2020-02-03
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {
        Interface1 i = new B();
        A a = new A(i);
        a.depend1();
        a.depend2();
        a.depend3();
    }
}

class B implements Interface1 {

    @Override
    public void m1() {
        System.out.println("B实现了m1");
    }

    @Override
    public void m2() {
        System.out.println("B实现了m2");
    }

    @Override
    public void m3() {
        System.out.println("B实现了m3");
    }

    @Override
    public void m4() {
        System.out.println("B实现了m4");
    }

    @Override
    public void m5() {
        System.out.println("B实现了m5");
    }
}

class A {
    private Interface1 i;

    public A(Interface1 i) {
        this.i = i;
    }

    public void depend1() {
        i.m1();
    }

    public void depend2() {
        i.m2();
    }

    public void depend3() {
        i.m3();
    }
}
