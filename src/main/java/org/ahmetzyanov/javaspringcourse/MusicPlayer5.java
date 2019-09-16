package org.ahmetzyanov.javaspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MusicPlayer5 {
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer5(@Qualifier("metalMusic") Music music1,
                        @Qualifier("tranceMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic() {
        return "playing: " + music1.getSong() + " & " + music2.getSong() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @PostConstruct
    public void turnOnPlayer() {
        System.out.println("\n---> Turn on Player3 == " + this.toString() + "\n");
    }

    @PreDestroy
    public void turnOffPlayer() {
        System.out.println("\n---> Turn off Player3 == " + this.toString() + "\n");
    }
}
