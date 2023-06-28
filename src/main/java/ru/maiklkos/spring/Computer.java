package ru.maiklkos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    private int id;
    private MusicalPlayer musicalPlayer;

    @Autowired
    public Computer(MusicalPlayer musicalPlayer) {
        this.id = 1;
        this.musicalPlayer = musicalPlayer;
    }

    @Override
    public String toString() {
        musicalPlayer.playMusic();
        return "Computer " + id + " is on";
    }
}
