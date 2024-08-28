package chapters;

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
        if (totalCheckpoints == reachedCheckpoints) {
            return 100.0;
        }
        return ((reachedCheckpoints * 100) / (double) totalCheckpoints);
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

    public boolean isHasBossBattle() {
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
