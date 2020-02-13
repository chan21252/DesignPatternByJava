package facade.subsystem;

public class Projector {

    private static Projector instance = new Projector();

    private Projector() {
        System.out.println("创建投影仪");
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("投影仪启动");
    }

    public void off() {
        System.out.println("投影仪关闭");
    }

}
