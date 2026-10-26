public class Director extends Person {
    private int numberOfShows;

    public Director(String firstName, String lastName, Gender gender, int numberOfShows) {
        super(firstName, lastName, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (поставил спектаклей: " + numberOfShows + ")";
    }
}
