package com.theo;

import org.springframework.stereotype.Component;

// using annotations
@Component
public class Work implements Human{
    @Override
    public void thePerson() {
        System.out.println("Systems Developer");
    }
}
