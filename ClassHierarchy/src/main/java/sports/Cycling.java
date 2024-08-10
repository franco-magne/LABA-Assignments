package sports;

public class Cycling extends OlympicSport {
    private String typeOfCompetition; // mountain, track, BMX, etc.

    public Cycling(String name, boolean isTeamGame, String typeOfCompetition) {
        super(name, isTeamGame);
        this.typeOfCompetition = typeOfCompetition;
    }

    public void someRulesToKnow() {
        System.out.println("In BMX, competitors have two one-minute runs over various obstacles.");
    }

    public String getTypeOfCompetition() {
        return typeOfCompetition;
    }

    public void setTypeOfCompetition(String typeOfCompetition) {
        this.typeOfCompetition = typeOfCompetition;
    }
}
