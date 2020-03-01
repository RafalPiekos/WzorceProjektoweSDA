package studentteacherproject;

import java.util.List;

public class PersonAPI {

    private DisplayContext displayContext = new DisplayContext();

    public Student addStudent(String firstName, String lastName, String course) {
        return new Student.StudentBuilder(firstName, lastName, course).build();
    }

    public Teacher addTeacher(String firstName, String lastName, List<String> blocks) {
        return new Teacher.TeacherBuilder(firstName, lastName, blocks).build();
    }

    public void displayFirstByName(Person person) {
        displayContext.setDisplayStrategy(new FirstNameDisplay());
        displayContext.display(person);
    }

    public void displayByLastName(Person person) {
        displayContext.setDisplayStrategy(new LastNameDisplay());
        displayContext.display(person);
    }

}
