package studentteacherproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        PersonAPI personAPI = new PersonAPI();
        List<Person> personList = new ArrayList<>();

        personList.add(personAPI.addStudent("John", "Doe", "java"));
        personList.add(personAPI.addStudent("Max", "Schreiber", "pryomancy"));
        personList.add(personAPI.addStudent("Ulrika", "Magdova", "vampirology"));
        personList.add(personAPI.addStudent("Felix", "Jaeger", "poetry"));
        personList.add(personAPI.addTeacher("Gotrek", "Gurnisson", Arrays.asList("demonslaying", "orcslaying")));

        for (Person person : personList) {
            System.out.println(person);
        }

        for(Person person : personList) {
            personAPI.displayByLastName(person);
        }

        for(Person person : personList) {
            personAPI.displayFirstByName(person);
        }

    }

}
