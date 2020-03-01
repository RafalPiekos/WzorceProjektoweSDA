package studentteacherproject;

import java.util.List;

public class LastNameDisplay implements DisplayStrategy {
    @Override
    public void display(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Surname: " + person.getLastName());
        }
    }
}
