package org.ahmetzyanov.javaspringcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer2 {
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

    public MusicPlayer2() {
    }

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("The 2nd player is playing: " + music.getSong());
        }
    }
}
