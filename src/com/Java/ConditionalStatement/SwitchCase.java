package com.Java.ConditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        int Day;
//        System.out.println("Enter Day");
//        Scanner sc = new Scanner(System.in);
//        Day = sc.nextInt();
//        switch (Day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("TU");
//                break;
//
//            case 3:
//                System.out.println("We");
//                break;
//
//            case 4:
//                System.out.println("Thu");
//                break;
//
//            case 5:
//                System.out.println("Fri");
//                break;
//            case 6:
//                System.out.println("Satu");
//                break;
//            case 7:
//                System.out.print("Sun");
//                break;
//       int b=30;
//       int c=b%5;
//        System.out.println(c);
//
//        int a;
//        System.out.println("Enter year");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//
//        if(a%4==0 || a%100==0 || a%400==0 ) {
//
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }
        //   }
        String a;
        System.out.println("Enter Domain");
        Scanner sc = new Scanner(System.in);
        a = sc.next();
//     if( a.startsWith(".com")){
//         System.out.println("gand");
//
//     } else if (a.startsWith(".org")) {
//
//         System.out.println("gand ka choda");
//
//        } else if (a.startsWith(".in")) {
//
//        System.out.println("bsdk");
        String B= ".com";
        String C= ".org";
        String I= ".in";
       if (a.equals(B)){
           System.out.println("gand");
       }
    }
}