package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringOne {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBeanOne testBeanOne = context.getBean("testBean", TestBeanOne.class);

        System.out.println(testBeanOne.getName());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();

        MusicPlayerTwo secondMusicPlayer = context.getBean("secondMusicPlayerBean", MusicPlayerTwo.class);
        secondMusicPlayer.playMusic();
        System.out.println("Name   : " + secondMusicPlayer.getName());
        System.out.println("Volume : " + secondMusicPlayer.getVolume());
        context.close();
    }
}
