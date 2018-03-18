package com.ua.training.hw1;

import java.util.Scanner;

public class HW1 {
    HW1(Greet great){
        System.out.println(great.greeting);
    }

    public static void main(String[] args) {
        Greet gr= new Greet();
        HW1 hw1= new HW1(gr);
    }
}
