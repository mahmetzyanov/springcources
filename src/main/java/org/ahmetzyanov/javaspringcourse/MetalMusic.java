package org.ahmetzyanov.javaspringcourse;

import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music {

    @Override
    public String getSong() {
        return "Nothing Else Matters";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Metal music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Metal music");
    }
}
