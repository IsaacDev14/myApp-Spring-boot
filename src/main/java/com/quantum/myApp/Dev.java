package com.quantum.myApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    Labtop laptop;
    public void build(){

        laptop.compile();

        System.out.println("hi, I'm great in coding");
    }
}
