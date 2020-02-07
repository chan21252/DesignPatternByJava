package factory.simplefactory.pizzastore.pizza;

/**
 * pizza基类
 *
 * @author Administrator
 */
public abstract class BasePizza {
    private String name;

    public BasePizza() {
    }

    public BasePizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 准备披萨
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "正在烘焙");
    }

    public void cut() {
        System.out.println(name + "正在切");
    }

    public void box() {
        System.out.println(name + "正在打包");
    }
}
