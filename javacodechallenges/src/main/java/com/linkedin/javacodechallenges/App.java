package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        boolean upper = false;
        boolean lower = false;
        boolean num = false;

        if (password.length() < 6){
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char passChar = password.charAt(i); 
            if (passChar >= 'A' && passChar <= 'Z'){
                upper = true;
            }

            if (passChar >= 'a' && passChar <= 'z'){
                lower = true;
            }

            if (passChar >= '0' && passChar <= '9'){
                num = true;
            }
        }
        if (num && lower && upper){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
