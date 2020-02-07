package factory.factorymethod.pizzastore.pizza;

/**
 * 北京芝士披萨
 *
 * @author Administrator
 */
public class BJCheesePizza extends BasePizza {

    public BJCheesePizza() {
    }

    public BJCheesePizza(String name) {
        super(name);
    }

    /**
     * 准备披萨
     */
    @Override
    public void prepare() {
        System.out.println(getName() + "正在准备");
    }
}
