package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.BasePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂类
 *
 * @author Administrator
 */
public abstract class BasePizzaOrder {
    public BasePizzaOrder() {
        BasePizza pizza = null;
        String orderType;
        while (true) {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        }
    }

    /**
     * 生成pizza
     *
     * @param orderType 订购类型
     * @return BasePizza
     */
    public abstract BasePizza createPizza(String orderType);

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
