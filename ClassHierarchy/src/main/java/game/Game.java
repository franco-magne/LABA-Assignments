package game;

import chapters.Chapter;
import chapters.ProgressCalculator;
import difficulty.Difficulty;
import java.util.HashSet;
import java.util.Set;

public final class Game {
    private final int idGame;
    private Difficulty difficulty;
    private Set<Chapter> chaptersUnlocked;
    private double globalProgress;
    private GameStatus gameStatus;

    public Game(int idGame, Difficulty difficulty, double globalProgress, GameStatus gameStatus) {
        this.idGame = idGame;
        this.difficulty = difficulty;
        this.chaptersUnlocked = new HashSet<>();
        this.globalProgress = globalProgress;
        this.gameStatus = gameStatus;
    }

    public void addChapter(Chapter chapter) {
        this.chaptersUnlocked.add(chapter);
    }

    public double calculateGameProgress() {
        int totalChapters = 29;
        ProgressCalculator<Integer, Integer, Double> gameProgress = (Integer a, Integer b) -> (a * 100) / (double) b;

        return gameProgress.calculate(chaptersUnlocked.size(), totalChapters);
    }

    @Override
    public int hashCode() {
        return this.idGame; // the ID once assigned, cannot be modified. The ID is unique, like the hashCode
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // If is the same object
        }
        if (o == null || getClass() != o.getClass()) {
            return false; // If the object is null or another class
        }
        Game auxGame = (Game) o;

        return this.idGame == auxGame.hashCode();
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Chapter> getChaptersUnlocked() {
        return chaptersUnlocked;
    }

    public void setChaptersUnlocked(Set<Chapter> chaptersUnlocked) {
        this.chaptersUnlocked = chaptersUnlocked;
    }

    public double getGlobalProgress() {
        return globalProgress;
    }

    public void setGlobalProgress(double globalProgress) {
        this.globalProgress = globalProgress;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
