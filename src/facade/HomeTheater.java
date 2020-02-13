package facade;

import facade.facade.TheaterFacade;

public class HomeTheater {
    public static void main(String[] args) {
        TheaterFacade theaterFacade = new TheaterFacade();

        theaterFacade.ready();
        theaterFacade.play();
        theaterFacade.pause();
        theaterFacade.end();
    }
}
