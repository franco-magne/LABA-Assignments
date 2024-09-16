package combos;

public enum ControllerButtons {
    TRIANGLE(Console.PLAYSTATION),
    CIRCLE(Console.PLAYSTATION),
    SQUARE(Console.PLAYSTATION),
    CROSS(Console.PLAYSTATION),
    L1(Console.PLAYSTATION),
    L2(Console.PLAYSTATION),
    L3(Console.PLAYSTATION),
    R1(Console.PLAYSTATION),
    R2(Console.PLAYSTATION),
    R3(Console.PLAYSTATION),
    LEFT_STICK_UP(Console.PLAYSTATION),
    LEFT_STICK_LEFT(Console.PLAYSTATION),
    LEFT_STICK_RIGHT(Console.PLAYSTATION),
    LEFT_STICK_DOWN(Console.PLAYSTATION);

    private final Console console;

    ControllerButtons(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }

}
