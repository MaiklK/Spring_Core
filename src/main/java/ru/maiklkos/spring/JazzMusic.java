package ru.maiklkos.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class JazzMusic implements Music{
    Random r = new Random();
    List<String> listSongs = new ArrayList<>(Arrays.asList("Sinatra", "Armstrong", "Crosby"));

    public JazzMusic() {

    }

    @Override
    public String getSong() {
        return listSongs.get(r.nextInt(0,3));
    }
}
