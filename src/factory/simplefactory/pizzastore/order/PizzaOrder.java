package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.BasePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购披萨
 *
 * @author Administrator
 */
public class PizzaOrder {

    public PizzaOrder() {
        while (true) {
            String orderType = getOrderType();
            BasePizza pizza = PizzaSimpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        }
    }

    private String getOrderType() {
        System.out.println("你想订购什么披萨？");
        BufferedReader strin = null;
        try {
            strin = new BufferedReader(new InputStreamReader(System.in));
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
