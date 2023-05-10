package com.example.AOPTest;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
    public void printHello() {
        System.out.println("Hello");
    }

    int getNum() {
        return 5;
    }

    public int getSum (int a, int b) {
        return a + b;
    }
}