package chapters;

import java.util.function.Predicate;

public class Chapter {
    private String name;
    private int numberOfKinematics;
    private boolean hasBossBattle;
    private double progressCompleted;
    private int totalCheckpoints;
    private int reachedCheckpoints;

    public Chapter(String name, int numberOfKinematics, boolean hasBossBattle, double progressCompleted, int totalCheckpoints, int reachedCheckpoints) {
        this.name = name;
        this.numberOfKinematics = numberOfKinematics;
        this.hasBossBattle = hasBossBattle;
        this.progressCompleted = progressCompleted;
        this.totalCheckpoints = totalCheckpoints;
        this.reachedCheckpoints = reachedCheckpoints;
    }

    public final double calculateChapterProgress() {
        ProgressCalculator<Integer, Integer, Double> chapterProgress = (Integer a, Integer b) -> (a * 100) / Double.valueOf(b);

        return chapterProgress.calculate(this.reachedCheckpoints, this.totalCheckpoints);
    }

    public boolean isChapterFinished(int reachedCheckpoints) {
        Predicate<Integer> chapterCheckpointsProgress = a -> a == this.totalCheckpoints;

        return chapterCheckpointsProgress.test(reachedCheckpoints);
    }

    public boolean halfCheckpointsHaveBeenReached(int reachedCheckpoints) {
        Predicate<Integer> checkpointsReached = a -> a > (totalCheckpoints / 2);

        return checkpointsReached.test(reachedCheckpoints);
    }

    public boolean allKinematicsHaveBeenPlayed(int numberOfKinematicsPlayed) {
        Predicate<Integer> kinematicsPlayed = a -> a == this.numberOfKinematics;

        return kinematicsPlayed.test(numberOfKinematicsPlayed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfKinematics() {
        return numberOfKinematics;
    }

    public void setNumberOfKinematics(int numberOfKinematics) {
        this.numberOfKinematics = numberOfKinematics;
    }

    public boolean getHasBossBattle() {
        return hasBossBattle;
    }

    public void setHasBossBattle(boolean hasBossBattle) {
        this.hasBossBattle = hasBossBattle;
    }

    public double getProgressCompleted() {
        return progressCompleted;
    }

    public void setProgressCompleted(double progressCompleted) {
        this.progressCompleted = progressCompleted;
    }

    public int getTotalCheckpoints() {
        return totalCheckpoints;
    }

    public void setTotalCheckpoints(int totalCheckpoints) {
        this.totalCheckpoints = totalCheckpoints;
    }

    public int getReachedCheckpoints() {
        return reachedCheckpoints;
    }

    public void setReachedCheckpoints(int reachedCheckpoints) {
        this.reachedCheckpoints = reachedCheckpoints;
    }
}
