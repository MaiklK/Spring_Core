package ru.maiklkos.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicalPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public MusicalPlayer() {
    }

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
