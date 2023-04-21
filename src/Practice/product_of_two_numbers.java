package Practice;

import java.util.Scanner;

public class product_of_two_numbers {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Give first number");
        int Num1 = Num.nextInt();
        System.out.println("Give second number");
        int Num2 = Num.nextInt();
        System.out.println(" the product of two numbers is: "+ (Num1 * Num2) );
    }
}
