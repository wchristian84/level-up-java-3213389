package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double base = 18.84;
        double CCFs;
        double additionalGallons = gallonsUsage - 1496;

        if (additionalGallons < 0) {
            return base;
        }
        else {
            CCFs = Math.ceil(additionalGallons / 748);
            return base + CCFs * 3.90;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
