package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.BasePizza;
import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.DurianPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;

/**
 * pizza简单工厂
 *
 * @author Administrator
 */
public class PizzaSimpleFactory {
    public static BasePizza createPizza(String orderType) {
        BasePizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza("芝士披萨");
        } else if ("durian".equals(orderType)) {
            pizza = new DurianPizza("榴莲披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza("胡椒披萨");
        }

        return pizza;
    }
}
