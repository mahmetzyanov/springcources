package org.ahmetzyanov.javaspringcourse;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Eye of the Tiger";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Rock music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Rock music");
    }
}
