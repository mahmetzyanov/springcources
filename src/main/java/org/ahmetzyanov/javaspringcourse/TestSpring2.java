package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        MusicPlayer2 firstMusicPlayer = context.getBean("secondMusicPlayerBean", MusicPlayer2.class);
        MusicPlayer2 secondMusicPlayer = context.getBean("secondMusicPlayerBean", MusicPlayer2.class);

        System.out.println(firstMusicPlayer==secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);


        System.out.println("Name of secondMusicPlayer  : " + secondMusicPlayer.getName());
        System.out.println("Volume of secondMusicPlayer: " + secondMusicPlayer.getVolume());


        firstMusicPlayer.setName("Aloha");
        firstMusicPlayer.setVolume(100);
        System.out.println("-- Updated options of the firstMusicPlayer");

        System.out.println("Name of secondMusicPlayer  : " + secondMusicPlayer.getName());
        System.out.println("Volume of secondMusicPlayer: " + secondMusicPlayer.getVolume());

        context.close();
    }
}
