package com.company;

import java.sql.SQLOutput;

public class DummyClass {
    public String story;

    public DummyClass(String story){

        this.story=story;

    }

    @MyCustomAnotation()
    public void printStory(){
        System.out.println("Read my story" + this.story);
    }

}
