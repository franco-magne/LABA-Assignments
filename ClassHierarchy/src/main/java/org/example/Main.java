package org.example;

import sports.Archery;
import sports.Boxing;
import sports.Cycling;
import sports.Football;

public class Main {
    public static void main(String[] args) {

        Football football = new Football("football", 22, 90,
                "grass", true, 3);

        Archery archery = new Archery("archery", "singles");

        System.out.println("Olympic Games Paris 2024\n");

        System.out.println("The " + football.getName() + " is played by " + football.getAmountOfPlayers() + " players. As " +
                "it's " + football.getIsTeamGame() + " that is played by teams, each one consists of 11 players. The game " +
                "duration is " + football.getGameDurationInMinutes() + " minutes and it's played in a " +
                football.getTerrainType() + " terrain. Normally, there are " + football.getSustitutionQuantityPerTeam() +
                " sustitions per team.");
        System.out.print("Rules to know: ");
        football.someRulesToKnow();

        System.out.println("\nThe " + archery.getName() + " can be played in " + archery.getTypeOfEvent() + " or doubles.");
        System.out.print("Rules to know: ");
        archery.someRulesToKnow();
        System.out.println();

        Archery archSingles = new Archery("archery", "singles");
        Archery archTeam = new Archery("archery", "team");
        System.out.println(archSingles.getName() + " & " +  archSingles.getTypeOfEvent());
        System.out.println(archTeam.getName() + " & " +  archTeam.getTypeOfEvent());
        System.out.println("Are they the same? " + archSingles.equals(archTeam));
        System.out.println();

        Cycling bmx = new Cycling("Cycling", false, "BMX");
        Cycling mountain = new Cycling("Cycling", false, "Mountain");
        System.out.println(bmx.toString());
        System.out.println(mountain.toString());
        System.out.println();

        Boxing boxing1 = new Boxing("Boxing", 2, 10, "ring", false, 78);
        System.out.println(boxing1.getName() + " " + boxing1.getWeightCategoryInKg() + " KG category, in grams is " + boxing1.hashCode());

    }
}