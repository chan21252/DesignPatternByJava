package template;

/**
 * @author Administrator
 */
public abstract class AbstractSoyMilk {

    public void select() {
        System.out.println("选择上好的黄豆");
    }

    public void soak() {
        System.out.println("浸泡3小时");
    }

    /**
     * 添加配料
     */
    public abstract void addIngredients();

    public void addWater() {
        System.out.println("加水");
    }

    public void stir() {
        System.out.println("搅拌");
    }

    public void complete() {
        System.out.println("豆浆制作完成");
    }

    public final void make() {
        System.out.println("======");
        select();
        soak();
        addIngredients();
        stir();
        complete();
        System.out.println("======");
    }
}
