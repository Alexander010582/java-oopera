import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String firstName, String lastName, Gender gender, int height) {
        super(firstName, lastName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                firstName.equals(actor.firstName) &&
                lastName.equals(actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height);
    }
}
