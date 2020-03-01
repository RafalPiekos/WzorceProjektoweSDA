package studentteacherproject;

public class Student extends Person {

    private String course;

    private Student(StudentBuilder builder) {
        super(builder.firstName, builder.lastName);
        this.course = builder.course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getFirstName() + '\'' +
                ", surname='" + getLastName() + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String course;

        public StudentBuilder(String firstName, String lastName, String course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
