package sports;

public final class OlympicCommittee {

    public static String location;

    static {
        location = "Paris";
    }

    public static void getSportCompetitionDay(OlympicSport sport) {

        if ( (sport.getName() == "Archery") || (sport.getName() == "Cycling") ) {
            System.out.println("MONDAY");
        } else if ( sport.getName() == "Basketball" ) {
            System.out.println("TUESDAY");
        } else if ( sport.getName() == "Football" ) {
            System.out.println("WEDNESDAY");
        } else if ( (sport.getName() == "Weightlifting") || (sport.getName() == "Boxing") ) {
            System.out.println("THURSDAY");
        } else if ( sport.getName() == "Tennis" ) {
            System.out.println("FRIDAY");
        } else if ( (sport.getName() == "Volleyball") || (sport.getName() == "Rugby") ) {
            System.out.println("SATURDAY");
        } else if ( sport.getName() == "Golf" ) {
            System.out.println("SUNDAY");
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
