package com.Java.ConditionalStatement;//import java.util.Scanner;
//
//public class RockPaper {
//   String user;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Value1:");
//        String userInput1 = sc.next();
//        System.out.println("Enter a Value 2:");
//        String userInput2 = sc.next();
//
//        if (userInput1 == "rock" && userInput2 =="paper")
//        {
//            System.out.println("user 1 win");
//        }
//        else if(userInput1=="paper" && userInput2=="rock")
//        {
//            System.out.println("user 2 win");
//        }
//        else if (userInput1== "rock" && userInput2== "scissor" ) {
//            System.out.println(" user 2 win ");
//
//        }
//        else if (userInput1=="scissor" && userInput2=="stone") {
//            System.out.println("user 2 win");
//
//        }
//        else if (userInput1=="paper" && userInput2=="scissor") {
//            System.out.println("user 2 win ");
//
//        }
//        else if (userInput1=="scissor" && userInput2=="paper") {
//
//            System.out.println("user 1 win ");
//
//        }
//
//
//
//    }
//}
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value1:");
        String userInput1 = sc.next();
        System.out.println("Enter a Value 2:");
        String userInput2 = sc.next();

        if (userInput1.equals("rock") && userInput2.equals("paper")) {
            System.out.println("user 2 win");
        } else if (userInput1.equals("paper") && userInput2.equals("rock")) {
            System.out.println("user 1 win");
        } else if (userInput1.equals("rock") && userInput2.equals("scissor")) {
            System.out.println("user 1 win");
        } else if (userInput1.equals("scissor") && userInput2.equals("rock")) {
            System.out.println("user 2 win");
        } else if (userInput1.equals("paper") && userInput2.equals("scissor")) {
            System.out.println("user 2 win");
        } else if (userInput1.equals("scissor") && userInput2.equals("paper")) {
            System.out.println("user 1 win");
        } else {
            System.out.println("Tie");
        }
    }
}

