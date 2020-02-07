package factory.simplefactory.pizzastore.pizza;

/**
 * 芝士披萨
 *
 * @author Administrator
 */
public class CheesePizza extends BasePizza {

    public CheesePizza() {
    }

    public CheesePizza(String name) {
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
