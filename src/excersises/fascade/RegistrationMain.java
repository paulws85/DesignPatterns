package excersises.fascade;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RegistrationMain {
    public static void main(String[] args) {

        PersonFacade personFacade = new PersonFacade();
        List<Person> personList = new LinkedList<>();
        List<BlockName> blocks = Arrays.asList(BlockName.EXCEL_BASE, BlockName.EXCEL_ADVANCED);

        personList.add(personFacade.addStudent("Jan", "Kowalski", "Java podstawy"));
        personList.add(personFacade.addTeacher("Ewa", "Piotrkowska", blocks));

        System.out.println("Imiona:");
        personFacade.displayFirstName(personList);
        System.out.println("Nazwiska:");
        personFacade.displayLastName(personList);

    }
}
