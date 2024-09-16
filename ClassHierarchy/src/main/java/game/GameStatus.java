package game;

public enum GameStatus {
    PLAYING(""),
    FINISHED(""),
    STOPPED("");

    private String timestamp;

    GameStatus(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
