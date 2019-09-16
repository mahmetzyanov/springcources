package org.ahmetzyanov.javaspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer1 {
    private int id;
    private MusicPlayer5 musicPlayer5;

    @Autowired
    public Computer1(MusicPlayer5 musicPlayer5) {
        this.id = 1;
        this.musicPlayer5 = musicPlayer5;
    }

    @Override
    public String toString() {
        return "\nComputer1 #" + id + " is " + musicPlayer5.playMusic();
    }
}
