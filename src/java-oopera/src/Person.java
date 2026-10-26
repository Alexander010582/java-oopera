public class Person {
    public String firstName;
    public String lastName;
    public Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
 enum Gender{
     MALE,
     FEMALE
 }