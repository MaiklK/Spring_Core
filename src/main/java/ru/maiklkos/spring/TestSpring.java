package ru.maiklkos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
                );

        Music music = context.getBean("classicalMusic", Music.class);
        MusicalPlayer musicalPlayer = new MusicalPlayer(music);
        musicalPlayer.playMusic();
        context.close();
    }
}
