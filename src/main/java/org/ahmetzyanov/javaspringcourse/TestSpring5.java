package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext4.xml"
        );

        Music music1 = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music1);
        musicPlayer.playMusic();

        Music music2 = context.getBean("metalMusic", Music.class);
        musicPlayer.setMusic(music2);
        musicPlayer.playMusic();

        context.close();
    }
}
