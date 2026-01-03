package com.quantum.myApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){

        compile();
        debug();
        System.out.println("hi, I'm great in coding");
    }
}
