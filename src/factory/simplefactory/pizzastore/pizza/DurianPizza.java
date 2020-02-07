package factory.simplefactory.pizzastore.pizza;

/**
 * 榴莲披萨
 *
 * @author Administrator
 */
public class DurianPizza extends BasePizza {

    public DurianPizza() {
    }

    public DurianPizza(String name) {
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
