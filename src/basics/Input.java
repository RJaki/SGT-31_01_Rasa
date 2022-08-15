package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine(); //stops the code until enter the name
        System.out.println("Your name is " + name);


        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " old");

// test

    }
}
