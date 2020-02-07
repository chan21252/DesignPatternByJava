package test;

import factory.factorymethod.pizzastore.order.BJPizzaOrder;
import factory.factorymethod.pizzastore.order.BasePizzaOrder;
import factory.factorymethod.pizzastore.order.LDizzaOrder;
import factory.simplefactory.pizzastore.order.PizzaOrder;
import org.junit.Test;

import java.util.Scanner;

/**
 * 工厂方法测试
 *
 * @author Administrator
 */
public class FactoryTest {
    @Test
    public void testPizzaSimpleFactory() {
        PizzaOrder pizzaOrder = new PizzaOrder();
    }

    @Test
    public void testPizzaFactoryMethod() {
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