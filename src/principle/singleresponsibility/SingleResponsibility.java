package principle.singleresponsibility;

/**
 * 单一职责原则
 *
 * @author Administrator
 * @since 2020-02-03
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.swim("船");
        vehicle.fly("飞机");
    }
}

class Vehicle {
    public void run(String name) {
        System.out.println(name + "在公路上运行");
    }

    public void swim(String name) {
        System.out.println(name + "在水里运行");
    }

    public void fly(String name) {
        System.out.println(name + "在天上飞");
    }
}

