package com.ua.training.hw1;

import java.util.Scanner;

public class Greet {
    String greeting;
    Boolean itr=true;
    Boolean itr1=true;
    Greet(){
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter smth");
        while(itr) {
            String str = sc1.nextLine();
            if (str.equals("Hello")) {
                greeting += str + " ";
                itr = false;
            } else {
                System.out.println("Wrong insert");
            }
                    }

         while(itr1) {
            System.out.println("One more word");
                   String str1 = sc1.nextLine();
                   if (str1.equals("world!")) {
                       greeting += str1;
                       itr1=false;

                   } else {
                       System.out.println("Wrong insert");
                       }
               }


    }

}
