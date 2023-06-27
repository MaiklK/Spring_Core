package ru.maiklkos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicalPlayer {

    @Qualifier("rockMusic")
    @Autowired
    private Music rockMusic;
    @Qualifier("classicalMusic")
    @Autowired
    private Music classicalMusic;
    public MusicalPlayer(@Qualifier("rockMusic") Music rockMusic,
                         @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(Genre genre) {
        if (genre == Genre.CLASSICAL_MUSIC) {
            return "Playing: " + classicalMusic.getSong();
        } else if (genre == Genre.ROCK_MUSIC) {
            return "Playing: " + rockMusic.getSong();
        }
        return "Nothing to play";
    }

}
