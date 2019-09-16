package org.ahmetzyanov.javaspringcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer3 {
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

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

    public MusicPlayer3() {
    }

    public void turnOnPlayer() {
        System.out.println("---> Turn on Player3 == " + this.toString());
    }

    public void turnOffPlayer() {
        System.out.println("---> Turn off Player3 == " + this.toString());
    }

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("The 3rd player is playing: " + music.getSong());
        }
    }
}
