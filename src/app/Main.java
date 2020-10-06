package app;

import core.utils.PasswordUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "";
        String myPassword = "myPassword123";

        String salt = PasswordUtils.getSalt(30);
        String password = PasswordUtils.generateSecurePassword(myPassword, salt);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Enter your password to continue.");

        while (true) {
            input = scanner.next();
            boolean passwordMatch = PasswordUtils.verifyUserPassword(input, password, salt);

            if (passwordMatch) {
                System.out.println("Welcome to the application!");
                break;
            } else {
                System.out.println("Wrong password! Try again.");
            }
        }

    }
}
