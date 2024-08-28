package chapters;

public class ObjectNotFoundException extends Exception {
    private final String name;

    public ObjectNotFoundException(String name) {
        this.name = name;
    }

    public String informCannotContinue() {
        return "You need first to obtain " + name + " to continue.";
    }

    public String getName() {
        return name;
    }
}
