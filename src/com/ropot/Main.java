package com.ropot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "password123";
        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Enter your password to continue.");
        while (true) {
            input = scanner.next();

            if (input.equals(password)) {
                System.out.println("Welcome to the application!");
                break;
            } else {
                System.out.println("Wrong password! Try again.");
            }
        }
    }
}
