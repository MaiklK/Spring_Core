package ru.maiklkos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    @Autowired
    private MusicalPlayer musicalPlayer;
    private Computer(MusicalPlayer musicalPlayer) {
        this.id = 1;
        this.musicalPlayer = musicalPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicalPlayer.playMusic(Genre.ROCK_MUSIC);
    }
}
