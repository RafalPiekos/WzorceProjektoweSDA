package studentteacherproject;

public class FirstNameDisplay implements  DisplayStrategy {


    @Override
    public void display(Person person) {
        System.out.println("Name: " + person.getFirstName());
    }
}
