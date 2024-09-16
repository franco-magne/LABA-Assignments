package game;

public class InvalidPathException extends Exception {
    private final String wrongPath;

    public InvalidPathException(String wrongPath) {
        this.wrongPath = wrongPath;
    }

    public String informWrongPath() {
        return "The path typed was not found.";
    }

    public String getWrongPath() {
        return wrongPath;
    }
}
