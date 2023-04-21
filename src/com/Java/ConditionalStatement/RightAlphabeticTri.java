package com.Java.ConditionalStatement;

public class RightAlphabeticTri {
    public static void main(String[] args) {
        int a = 65;
        for(int i=0; i<=10; i++){
            for(int k =10; k>i; k--){
                System.out.print("__");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print((char) (a+j)+" ");
            }
            System.out.println();
        }
    }
}
