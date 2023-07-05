package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TeamUtils {

  public static void generateTeamsScores(List<Team> teams,
      int numberOfRounds) {
    Random random = new Random();
    teams.forEach(team -> {
      for (int i = 0; i < numberOfRounds; i++) {
        team.getScores().add(random.nextInt(11));
      }
    });
  }

  public static void revealResults(List<Team> teams) {
    if (teams.size() == 0) {
      return;
    } else {
      ArrayList<Team> teamArray = new ArrayList<Team>();
      for (int i = 0; i < teams.size(); i++) {
        teamArray.add(teams.get(i));
      }

      teamArray.sort(Comparator.comparing(Team::sumTotalScore).reversed());

      System.out.println("Now for the results, the WINNER is...");

      for (int i = 0; i < teamArray.size(); i++) {
        if (teamArray.get(i).sumTotalScore() == teamArray.get(i + 1).sumTotalScore()) {
          System.out.println(
              "With " + teamArray.get(i).sumTotalScore() + " points, it's team " + teamArray.get(i).getPlayer1()
                  + " and " + teamArray.get(i).getPlayer2() + "!\n");
          System.out.println(
              "With " + teamArray.get(i + 1).sumTotalScore() + " points, it's team " + teamArray.get(i + 1).getPlayer1()
                  + " and " + teamArray.get(i + 1).getPlayer2() + "!\n");
          i++;
        } else {
          System.out.println(
              "With " + teamArray.get(i).sumTotalScore() + " points, it's team " + teamArray.get(i).getPlayer1()
                  + " and " + teamArray.get(i).getPlayer2() + "!\n");
        }
        if (i < (teamArray.size() - 1)) {
          System.out.println("Then we have... \n");
        }
      }

      // if (teamArray.get(0).sumTotalScore() == teamArray.get(1).sumTotalScore()) {
      // System.out.println("It's a TIE!\n");
      // System.out.println("With " + teamArray.get(0).sumTotalScore() +
      // " points, it's team " + teamArray.get(0).getPlayer1() + " and " +
      // teamArray.get(0).getPlayer2() + "!\n");
      // System.out.println("With " + teamArray.get(1).sumTotalScore() +
      // " points, it's team " + teamArray.get(1).getPlayer1() + " and " +
      // teamArray.get(1).getPlayer2() + "!\n");
      // for (int i = 2; i < teamArray.size(); i++) {
      // System.out.println("Then we have... \n" +
      // "With " + teamArray.get(i).sumTotalScore() + " points, it's team " +
      // teamArray.get(i).getPlayer1()
      // + " and "
      // + teamArray.get(i).getPlayer2() + "!\n");
      // }
      // } else {
      // System.out.println("With " + teamArray.get(0).sumTotalScore() +
      // " points, it's team " + teamArray.get(0).getPlayer1() + " and " +
      // teamArray.get(0).getPlayer2() + "!\n");
      // for (int i = 1; i < teamArray.size(); i++) {
      // System.out.println("Then we have... \n" +
      // "With " + teamArray.get(i).sumTotalScore() + " points, it's team " +
      // teamArray.get(i).getPlayer1()
      // + " and "
      // + teamArray.get(i).getPlayer2() + "!\n");
      // }
      // }
    }

  }
}