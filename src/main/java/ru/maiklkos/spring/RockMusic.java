package ru.maiklkos.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> listSongs = new ArrayList<>(Arrays.asList("Queen", "AC\\DC", "Led Zeppelin"));
    Random r = new Random();
    @Override
    public String getSong() {
        return listSongs.get(r.nextInt(0,3));
    }


}
