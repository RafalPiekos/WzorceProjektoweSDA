package studentteacherproject;

import java.util.List;

public class FirstNameDisplay implements  DisplayStrategy {


    @Override
    public void display(List<Person> persons) {
        for(Person person : persons) {
            System.out.println("Name: " + person.getFirstName());
        }
    }
}
