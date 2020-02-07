package factory.factorymethod.pizzastore.pizza;

/**
 * 北京胡椒披萨
 *
 * @author Administrator
 */
public class BJPepperPizza extends BasePizza {

    public BJPepperPizza() {
    }

    public BJPepperPizza(String name) {
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
