package excersises.fascade;

import java.util.List;

public class Teacher extends Person {

    private final List<BlockName> blocks;

    Teacher(TeacherBuilder teacherBuilder) {
        super(teacherBuilder.firstName, teacherBuilder.lastName);
        this.blocks = teacherBuilder.blocks;
    }

    public List<BlockName> getCourse() {
        return blocks;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "blocks='" + blocks + '\'' +
            ", firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            '}';
    }

    public static class TeacherBuilder {

        private String firstName;
        private String lastName;
        private List<BlockName> blocks;

        public TeacherBuilder() {
        }

        public TeacherBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public TeacherBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public TeacherBuilder blocks(List<BlockName> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }

    }

}
