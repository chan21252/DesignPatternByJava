package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import factory.factorymethod.pizzastore.pizza.BasePizza;

/**
 * 北京披萨工厂
 *
 * @author Administrator
 */
public class BJPizzaOrder extends BasePizzaOrder {
    /**
     * 生成pizza
     *
     * @param orderType 订购类型
     * @return BasePizza
     */
    @Override
    public BasePizza createPizza(String orderType) {
        BasePizza pizza = null;
        if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza("北京胡椒披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza("北京芝士披萨");
        }
        return pizza;
    }
}
