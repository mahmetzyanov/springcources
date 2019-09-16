package org.ahmetzyanov.javaspringcourse;

public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Dear Mama";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Rap music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Rap music");
    }
}
