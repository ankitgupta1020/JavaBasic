package com.Java.ConditionalStatement;

public class cwh_15_ps2 {
    public static void main(String[] args) {
//        String name = "jack Packer";
//        name = name.toLowerCase();
//        System.out.println(name);

        // Problem 2

//        String text = "To Lower case";
//        text = text.replace(" ", "_");
//        System.out.println(text);

        // problem 3

        String letter = " Dear <|name|>, thanks a lot!";
        letter= letter.replace("<|name|>", "Ankit" );
        System.out.println(letter);

        // Problem 4
        String myString = "This String contains  double and triple spaces";
        System.out.println((myString.indexOf("  ")));
        System.out.println((myString.indexOf("   ")));

        // problem 5
        String myLetter = "Dear Ankit,\n This java course is \n nice ";
        System.out.println(myLetter);
   }
}
