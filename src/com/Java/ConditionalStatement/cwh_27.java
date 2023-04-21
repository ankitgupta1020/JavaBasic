package com.Java.ConditionalStatement;

public class cwh_27 {
    public static void main(String[] args) {
        int [] marks = { 98, 45, 79, 99, 80};
        System.out.println(marks.length );
//        float [] marks = { 98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
//        String [] students = {"Harry", "Rohan", "Shubham", "Lovish"};
//
//        System.out.println(marks[2]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=marks.length -1; i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
