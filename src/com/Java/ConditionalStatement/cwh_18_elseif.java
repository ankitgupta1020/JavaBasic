package com.Java.ConditionalStatement;

import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Entr your age!: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired ! ");
                break;
            default:
                System.out.println("Enjoy your life! ");
        }

//        if(age>56){
//            System.out.println("You are exprienced ! ");
//        } else if (age>46) {
//            System.out.println("You are semi-exprienced!");
//        } else if (age>36) {
//            System.out.println("You are semi-semi-expriencd!");
//        }
//        else {
//            System.out.println("You are not exprienced");
//        }
    }
}
