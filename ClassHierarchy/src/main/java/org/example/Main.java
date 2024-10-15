package org.example;

import difficulty.Difficulty;
import difficulty.GameDifficulty;
import game.Game;
import game.GameStatus;

public class Main {
    public static void main(String[] args) {

        Difficulty easy = new Difficulty(GameDifficulty.SPARTAN, 1);
        Game firstGame = new Game(1, easy, 0, GameStatus.PLAYING);

        // TextFilesOperator.calculateNumberOfUniqueWords("logs/profiles.txt");
        //ReflectionExample.testReflection("relics.GoldenFleece");



    }
}