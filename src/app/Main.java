package app;

import core.utils.PasswordUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "";
        // This is password
        String password = "password123";

        // This is stored to database
        String salt = PasswordUtils.getSalt(30);

        // This is stored to database
        String encryptedPassword = PasswordUtils.generateSecurePassword(password, salt);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Enter your password to continue.");

        while (true) {
            input = scanner.next();
            // Here we compare user input with database encrypted password
            boolean passwordMatch = PasswordUtils.verifyUserPassword(input, encryptedPassword, salt);

            if (passwordMatch) {
                System.out.println("Welcome to the application!");
                break;
            } else {
                System.out.println("Wrong password! Try again.");
            }
        }

    }
}
