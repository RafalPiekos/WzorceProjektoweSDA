package studentteacherproject;

public class LastNameDisplay implements DisplayStrategy {
    @Override
    public void display(Person person) {
        System.out.println("Surname: " + person.getLastName());
    }
}
