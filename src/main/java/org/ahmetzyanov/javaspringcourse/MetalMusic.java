package org.ahmetzyanov.javaspringcourse;

import org.springframework.stereotype.Component;

@Component
public class MetallMusic implements Music {

    @Override
    public String getSong() {
        return "Never (DJ Tiesto Remix)";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Trance music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Trance music");
    }
}
