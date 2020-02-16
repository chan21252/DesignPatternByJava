package template;

public class WalnutSoyMilk extends AbstractSoyMilk {
    public WalnutSoyMilk() {
        System.out.println("制作核桃豆浆");
    }

    /**
     * 添加配料
     */
    @Override
    public void addIngredients() {
        System.out.println("加核桃");
    }
}