package com.Java.ConditionalStatement;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
//        for (int i=0; i<5;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");
//
//    }
//}
    int i=0;
    do {
        i++;
        if (i == 2) {
            System.out.println("Ending the loop");
            continue;
        }
        System.out.println(i);
        System.out.println("java is great");
    }while(i<5);
        System.out.println("Loop ends here");
    }
    }
