package com.Java.ConditionalStatement;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string in the format 'string1|string2':");
        String input = scanner.nextLine();
        scanner.close();

        String[] strings = input.split("\\|");

        // Check if input string has correct format
        if (strings.length != 2) {
            System.out.println("Invalid input format. Please enter two strings separated by a pipe (|) sign.");
            return;
        }

        String string1 = strings[0];
        String string2 = strings[1];

        // Check if string2 is a rotation of string1
        if (string1.length() != string2.length()) {
            System.out.println("Non-Rotated String");
            return;
        }

        String concatenated = string1 + string1;
        if (concatenated.contains(string2)) {
            System.out.println("Rotated String");
        } else {
            System.out.println("Non-Rotated String");
        }
    }
}
