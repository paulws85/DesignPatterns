package excersises.userRegistration;

import java.util.List;

public class FirstNameDisplayStrategy implements DisplayStrategy {

    @Override
    public void display(List<Person> persons) {
        persons.stream().map(Person::getFirstName).forEach(System.out::println);
    }
}
