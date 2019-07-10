package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args){

        DummyClass dummy = new DummyClass("I am a test dummy!");
        try{

            Method m = dummy.getClass().getMethod("printStory");
            MyCustomAnotation myCustomAnotation = m.getAnnotation(MyCustomAnotation.class);
            System.out.println("My annotation variables are: " + myCustomAnotation.name() + " " + myCustomAnotation.purpose());

        }catch (NoSuchMethodException e){

            System.out.println(e.getMessage());

        }


    }
}
