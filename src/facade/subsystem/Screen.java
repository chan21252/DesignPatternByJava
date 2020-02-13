package facade.subsystem;

public class Screen {

    private static Screen instance = new Screen();

    private Screen() {
        System.out.println("创建屏幕");
    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("屏幕收起");
    }

    public void down() {
        System.out.println("屏幕落下");
    }

}
