package org.example;

import difficulty.Difficulty;
import game.Game;

public class Main {
    public static void main(String[] args) {

        Difficulty easy = new Difficulty("Spartan", 1);
        Game firstGame = new Game(1, easy, 0, "PLAYING");

        // Difficulty.getUnderstandableDifficulty(easy);

        TextFilesOperator.calculateNumberOfUniqueWords("logs/profiles.txt");

    }
}