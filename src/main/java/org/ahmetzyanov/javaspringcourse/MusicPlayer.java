package org.ahmetzyanov.javaspringcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("The 1st player is playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
