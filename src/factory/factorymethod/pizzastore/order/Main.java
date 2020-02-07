package factory.factorymethod.pizzastore.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BasePizzaOrder pizzaOrder = null;
        System.out.println("请输入你要点哪个地方口味的披萨？");
        String type = in.next();

        if ("BJ".equals(type)) {
            pizzaOrder = new BJPizzaOrder();
        } else {
            pizzaOrder = new LDizzaOrder();
        }
    }
}
