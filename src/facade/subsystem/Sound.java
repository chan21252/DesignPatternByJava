package facade.subsystem;

public class Sound {

    private static Sound instance = new Sound();

    private Sound() {
        System.out.println("创建音响");
    }

    public static Sound getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("音响启动");
    }

    public void off() {
        System.out.println("音响关闭");
    }

}
