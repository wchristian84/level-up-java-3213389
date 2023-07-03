package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        if (purchases.size() == 0) {
            return 0.0;
        }

        ArrayList<Double> investments = new ArrayList<Double>();
        purchases.stream().forEach(purchase -> {
            investments.add(Math.ceil(purchase) - purchase);
        });

        double sum = 0;
        for (int i = 0; i < investments.size(); i++) {
            sum += investments.get(i);
        }

        return sum / investments.size();
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
