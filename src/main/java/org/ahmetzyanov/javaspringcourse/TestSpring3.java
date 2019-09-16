package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml"
        );

        MusicPlayer3 thirdMusicPlayer1 = context.getBean("thirdMusicPlayerBean", MusicPlayer3.class);
        MusicPlayer3 thirdMusicPlayer2 = context.getBean("thirdMusicPlayerBean", MusicPlayer3.class);
        thirdMusicPlayer1.playMusic();
        thirdMusicPlayer2.playMusic();

        context.close();
    }
}
