package com.Java.ConditionalStatement;

import java.util.Scanner;

public class Exercise1 {

    //
//        if(a>0){
//            System.out.println("Number is positive");
//        }
//        else {
//            System.out.println("Negative number");
//        }
//    }
//}
//    Here is the same pseudocode in a more structured format:
//
//    Input values of a, b and c from the user.
//    Calculate the discriminant using the formula: b^2 - 4ac
//    If the discriminant is greater than 0:
//    a. Calculate the two roots of the quadratic equation using the formula:
//    i. root1 = (-b + sqrt(discriminant))/2a
//    ii. root2 = (-b - sqrt(discriminant))/2a
//    b. Print the two roots.
//    If the discriminant is equal to 0:
//    a. Calculate the root of the quadratic equation using the formula: -b/2a
//    b. Print the root.
//    If the discriminant is less than 0:
//    a. Print a message stating that the quadratic equation has no real roots.
//    End.
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the values of a, b, and c: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//
//        if (num1 > num2)
//            if (num1 > num3)
//                System.out.println(num1);
//        if (num2 > num1)
//            if (num2 > num3)
//                System.out.println(num2);
//        if (num3 > num1)
//            if (num3 > num2)
//                System.out.println(num3);



        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();


        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }

    public static class cwh_23_for_loop {
        public static void main(String[] args) {
    //        for(int i=1; i<=10; i++){
    //            System.out.println(i);
    //        *****************************************
    //        int n = 5;
    //        for (int i=0; i<5; i++){
    //            System.out.println(2*i+1);
            int i;
            for(i=7; i!=0; i--){
                System.out.println(i);
            }
        }
    }
}

