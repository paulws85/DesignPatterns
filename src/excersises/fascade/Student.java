package excersises.fascade;

public class Student extends Person {

    private final String course;

    Student(StudentBuilder studentBuilder) {
        super(studentBuilder.firstName, studentBuilder.lastName);
        this.course = studentBuilder.course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
            "course='" + course + '\'' +
            ", firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            '}';
    }

    public static class StudentBuilder {

        private String firstName;
        private String lastName;
        private String course;

        public StudentBuilder() {

        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder course(String course) {
            this.course = course;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
