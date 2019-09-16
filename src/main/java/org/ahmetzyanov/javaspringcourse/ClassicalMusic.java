package org.ahmetzyanov.javaspringcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic (){
        System.out.println("-> Doing factory method");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void turnOnMusic (){
        System.out.println("--> Turn on Classical music");
    }
    public void turnOffMusic (){
        System.out.println("--> Turn off Classical music");
    }
}
