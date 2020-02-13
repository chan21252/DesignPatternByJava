package facade.subsystem;

public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {
        System.out.println("创建DVD播放器");
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD播放器启动");
    }

    public void off() {
        System.out.println("DVD播放器关闭");
    }

    public void pause() {
        System.out.println("DVD播放器暂停");
    }

    public void play() {
        System.out.println("DVD播放器播放");
    }
}
