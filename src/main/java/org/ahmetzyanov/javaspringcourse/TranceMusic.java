package org.ahmetzyanov.javaspringcourse;

public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Old Man Mose";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Jazz music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Jazz music");
    }
}
