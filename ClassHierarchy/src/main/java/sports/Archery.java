package sports;

public class Archery extends OlympicSport {
    private String typeOfEvent; // singles or team

    public Archery(String name, String typeofEvent) {
        super(name, false);
        this.typeOfEvent = typeofEvent;
    }

    public void someRulesToKnow() {
        System.out.println("If an arrow lands on the dividing line between two rings, " +
                "archers receive the higher score.");
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }
}
