package ru.maiklkos.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class
                );

        Computer computer = context.getBean("computer", Computer.class);

        MusicalPlayer musicalPlayer = context.getBean("musicalPlayer", MusicalPlayer.class);

        System.out.println(computer.toString());

        System.out.println(musicalPlayer.getVolume());
        System.out.println(musicalPlayer.getName());

        musicalPlayer.playMusic();

        context.close();
    }
}
