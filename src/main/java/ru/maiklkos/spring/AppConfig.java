package ru.maiklkos.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.*;

@Configuration
@ComponentScan("ru.maiklkos.spring")
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {

//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public JazzMusic jazzMusic() {
//        return new JazzMusic();
//    }
//
//    @Bean
//    public List<Music> musicList() {
//        return new ArrayList<>(Arrays.asList(jazzMusic(), rockMusic(), classicalMusic()));
//    }
//
//    @Bean
//    public MusicalPlayer musicalPlayer() {
//        return new MusicalPlayer(musicList());
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicalPlayer());
//    }

}
