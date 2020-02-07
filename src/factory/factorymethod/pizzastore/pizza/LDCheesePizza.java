package factory.factorymethod.pizzastore.pizza;

/**
 * 伦敦芝士披萨
 *
 * @author Administrator
 */
public class LDCheesePizza extends BasePizza {

    public LDCheesePizza() {
    }

    public LDCheesePizza(String name) {
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
