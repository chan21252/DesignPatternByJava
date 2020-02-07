package factory.simplefactory.pizzastore.pizza;

/**
 * 胡椒披萨
 *
 * @author Administrator
 */
public class PepperPizza extends BasePizza {

    public PepperPizza() {
    }

    public PepperPizza(String name) {
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
