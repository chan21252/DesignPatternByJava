package template;

public class MakeSoyMilk {
    public static void main(String[] args) {
        AbstractSoyMilk walnutSoyMilk = new WalnutSoyMilk();
        walnutSoyMilk.make();

        AbstractSoyMilk jujubeSoyMilk = new JujubeSoyMilk();
        jujubeSoyMilk.make();
    }
}
