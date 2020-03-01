package excersises.fascade;

import java.util.List;

public class PersonFacade {

    public Person addStudent(String firstName, String lastName, String course) {
        return new Student
            .StudentBuilder()
            .firstName(firstName)
            .lastName(lastName)
            .course(course)
            .build();
    }

    public Person addTeacher(String firstName, String lastName, List<BlockName> blocks) {
        return new Teacher
            .TeacherBuilder()
            .firstName(firstName)
            .lastName(lastName)
            .blocks(blocks)
            .build();
    }

    public void displayFirstName(List<Person> persons) {
        display(new FirstNameDisplayStrategy(), persons);
    }

    public void displayLastName(List<Person> persons) {
        display(new LastNameDisplayStrategy(), persons);
    }

    private void display(DisplayStrategy displayStrategy, List<Person> persons) {
        DisplayContext displayContext = new DisplayContext();
        displayContext.setDisplayStrategy(displayStrategy);
        displayContext.display(persons);
    }
}
