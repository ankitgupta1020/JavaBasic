package com.Java.ConditionalStatement;

import java.util.Scanner;
public class Practiceset4 {
    public static void main(String[] args) {
//        int a = 10;
//        if(a=11)
//            System.out.println("i am 11");
//
//    }

//                       Ouestion 2

//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//
//        }
//        else {
//            System.out.println("Sorry, you have not been promoted");
//        }
//
//    }
        // Question 3
        float tax = 0;
        float income = 3.3f;
        if (tax < 2.5) {
            tax = tax + 0;
        } else if (tax > 2.5f && tax > 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (tax > 5f && tax < 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.0f * (income - 2.5f);

        } else if (tax > 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5f);
            tax = tax + 0.05f * (income - 10.0f);
        }
    }
}



