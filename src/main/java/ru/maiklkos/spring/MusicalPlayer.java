package ru.maiklkos.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicalPlayer {

    private Music music;

    public MusicalPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
