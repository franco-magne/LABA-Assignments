package sports;

public class Archery extends OlympicSport {
    private String typeOfEvent; // singles or team

    public Archery(String name, String typeofEvent) {
        super(name, false);
        this.typeOfEvent = typeofEvent;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("If an arrow lands on the dividing line between two rings, " +
                "archers receive the higher score.");
    }

    @Override
    public boolean equals(Object object) {
        boolean value = false;
        Archery arch = (Archery) object;

        if (this.typeOfEvent == arch.getTypeOfEvent()) {
            value = true;
        }

        return value;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }
}
