package template;

public class JujubeSoyMilk extends AbstractSoyMilk {
    public JujubeSoyMilk() {
        System.out.println("制作红枣豆浆");
    }

    /**
     * 添加配料
     */
    @Override
    public void addIngredients() {
        System.out.println("加红枣");
    }
}
