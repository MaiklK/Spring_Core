package ru.maiklkos.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
                );

        MusicalPlayer musicalPlayer = context.getBean("musicPlayer", MusicalPlayer.class);
        musicalPlayer.playMusic();

        System.out.println(musicalPlayer.getName());
        System.out.println(musicalPlayer.getVolume());

        context.close();
    }
}
