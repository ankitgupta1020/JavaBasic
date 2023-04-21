package Practice;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Type your name");
        String Username = name.nextLine();
        System.out.println("Hello " + Username);
    }
}
