package principle.segregation;

interface Interface1 {
    void m1();

    void m2();

    void m3();
}

interface Interface2 {
    void m4();

    void m5();
}

/**
 * 接口隔离原则：
 * A通过接口i依赖B，只用到了接口的1,2,3方法，应该将接口i分离，保留A的最小依赖
 *
 * @author Administrator
 * @since 2020-02-03
 */
public class InterfaceSegregation1 {
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
