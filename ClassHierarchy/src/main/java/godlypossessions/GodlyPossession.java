package godlypossessions;

import java.util.function.Predicate;

public class GodlyPossession {
    private String name;
    private String locatedIn;
    private boolean wasFound;
    private boolean isActivated;
    public static int totalFound = 0;

    public GodlyPossession(String name, String locatedIn, boolean wasFound, boolean isActivated) {
        this.name = name;
        this.locatedIn = locatedIn;
        this.wasFound = wasFound;
        this.isActivated = isActivated;
        totalFound++;
    }

    public boolean allGodlyPossessionsWereFound(int total) {
        Predicate<Integer> wereAllFound = t -> t == 10; // total 10 in the game

        return wereAllFound.test(total);
    }

    @Override
    public String toString() {
        return "Godly Possession: { " +
                "name = " + name + ", " +
                "located in = " + locatedIn + ", " +
                "was found = " + wasFound + ", " +
                "is activated = " + isActivated + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedIn() {
        return locatedIn;
    }

    public void setLocatedIn(String locatedIn) {
        this.locatedIn = locatedIn;
    }

    public boolean getWasFound() {
        return wasFound;
    }

    public void setWasFound(boolean wasFound) {
        this.wasFound = wasFound;
    }

    public boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(boolean activated) {
        this.isActivated = activated;
    }
}