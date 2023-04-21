package com.Java.ConditionalStatement;

public class Practiice_method {
    // problem 1
//    static void multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d X %d = %d\n", n, i, n * i);
//        }
//    }

    //    public static void main(String[] args) {
//        int n = 8;
//        multiplication(n);
    //  problem 2
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; i++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

