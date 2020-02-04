package principle.liskov;

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

class A {
    public int func1(int a, int b) {
        return a + b;
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {
        return a - b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
