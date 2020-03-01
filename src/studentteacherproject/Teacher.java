package studentteacherproject;

import java.util.List;

public class Teacher extends Person {
    private List<String> blocks;

    private Teacher(TeacherBuilder builder) {
        super (builder.firstName, builder.lastName);
        this.blocks = builder.blocks;
    }

    public List<String> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getFirstName() + '\'' +
                ", surname='" + getLastName() + '\'' +
                ", blocks=" + blocks +
                '}';
    }

    public static class TeacherBuilder {
        private String firstName;
        private String lastName;
        private List<String> blocks;

        public TeacherBuilder(String firstName, String lastName, List<String> blocks) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.blocks = blocks;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }


}
