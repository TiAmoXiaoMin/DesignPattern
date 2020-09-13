package com.xlc.facate;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //调用所有设备准备好
    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        popcorn.pop();
        projector.on();
        projector.focus();
        screen.up();
        stereo.up();
        theaterLight.on();
    }


    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void close(){
        dvdPlayer.off();
        popcorn.off();
        projector.off();
        screen.down();
        stereo.off();
        theaterLight.bright();
    }



}
