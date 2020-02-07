package factory.factorymethod.pizzastore.pizza;

/**
 * 伦敦胡椒披萨
 *
 * @author Administrator
 */
public class LDPepperPizza extends BasePizza {

    public LDPepperPizza() {
    }

    public LDPepperPizza(String name) {
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
