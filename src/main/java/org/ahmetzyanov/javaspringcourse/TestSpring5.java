package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext4.xml"
        );

        MusicPlayer5 firstMusicPlayer = context.getBean("musicPlayer5", MusicPlayer5.class);
        firstMusicPlayer.playMusic();

        Computer1 computer1 = context.getBean("computer1", Computer1.class);
        System.out.println(computer1.toString());

        context.close();
    }
}
