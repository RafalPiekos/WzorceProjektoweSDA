package studentteacherproject;

import java.util.List;

public class PersonAPI {

    public Student addStudent(String firstName, String lastName, String course) {
        return new Student.StudentBuilder(firstName, lastName, course).build();
    }

    public Teacher addTeacher(String firstName, String lastName, List<String> blocks) {
        return new Teacher.TeacherBuilder(firstName, lastName, blocks).build();
    }

    public void displayFirstByName(List<Person> persons) {
        this.display(new FirstNameDisplay(), persons);
    }

    public void displayByLastName(List<Person> persons) {
        this.display(new LastNameDisplay(), persons);
    }

    private void display(DisplayStrategy displayStrategy, List<Person> persons) {
        DisplayContext displayContext = new DisplayContext();
        displayContext.setDisplayStrategy(displayStrategy);
        displayContext.display(persons);
    }

}
