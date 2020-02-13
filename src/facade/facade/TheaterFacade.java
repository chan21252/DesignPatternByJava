package facade.facade;

import facade.subsystem.DVDPlayer;
import facade.subsystem.Projector;
import facade.subsystem.Screen;
import facade.subsystem.Sound;

public class TheaterFacade {
    private DVDPlayer dvdPlayer;
    private Screen screen;
    private Projector projector;
    private Sound sound;

    public TheaterFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        screen = Screen.getInstance();
        projector = Projector.getInstance();
        sound = Sound.getInstance();
    }

    public void ready() {
        System.out.println("=====影院准备=====");
        screen.down();
        projector.on();
        sound.on();
        dvdPlayer.on();
    }

    public void play() {
        System.out.println("=====影院播放=====");
        dvdPlayer.play();
    }

    public void end() {
        System.out.println("=====影院关闭=====");
        dvdPlayer.off();
        sound.off();
        projector.off();
        screen.up();
    }

    public void pause() {
        System.out.println("=====影院暂停=====");
        dvdPlayer.pause();
    }
}
