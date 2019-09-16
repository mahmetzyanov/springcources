package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer2 firstMusicPlayer = context.getBean("secondMusicPlayerBean", MusicPlayer2.class);
        MusicPlayer2 secondMusicPlayer = context.getBean("secondMusicPlayerBean", MusicPlayer2.class);

        System.out.println(firstMusicPlayer==secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);


        System.out.println("Name   : " + secondMusicPlayer.getName());
        System.out.println("Volume : " + secondMusicPlayer.getVolume());

        firstMusicPlayer.setName("Aloha");
        firstMusicPlayer.setVolume(55);

        System.out.println("Name   : " + secondMusicPlayer.getName());
        System.out.println("Volume : " + secondMusicPlayer.getVolume());

        MusicPlayer3 thirdMusicPlayer = context.getBean("thirdMusicPlayerBean", MusicPlayer3.class);
        thirdMusicPlayer.playMusic();

        context.close();
    }
}
