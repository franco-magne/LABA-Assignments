package game;

import chapters.Chapter;
import difficulty.Difficulty;
import java.util.ArrayList;

public final class Game {
    private final int idGame;
    private Difficulty difficulty;
    private ArrayList<Chapter> chaptersUnlocked;
    private double globalProgress;
    private String gameStatus; // PLAYING or FINISH or STOPPED

    public Game(int idGame, Difficulty difficulty, ArrayList<Chapter> chaptersUnlocked, double globalProgress, String gameStatus) {
        this.idGame = idGame;
        this.difficulty = difficulty;
        this.chaptersUnlocked = chaptersUnlocked;
        this.globalProgress = globalProgress;
        this.gameStatus = gameStatus;
    }

    public void addOrbCosts(Chapter chapter) {
        this.chaptersUnlocked.add(chapter);
    }

    @Override
    public int hashCode() {
        return this.idGame; // the ID once assigned, cannot be modified. The ID is unique, like the hashCode
    }

    @Override
    public boolean equals(Object o) {
        boolean value;
        Game auxGame = (Game) o;

        value = this.idGame == auxGame.hashCode();

        return value;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<Chapter> getChaptersUnlocked() {
        return chaptersUnlocked;
    }

    public void setChaptersUnlocked(ArrayList<Chapter> chaptersUnlocked) {
        this.chaptersUnlocked = chaptersUnlocked;
    }

    public double getGlobalProgress() {
        return globalProgress;
    }

    public void setGlobalProgress(double globalProgress) {
        this.globalProgress = globalProgress;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }
}
