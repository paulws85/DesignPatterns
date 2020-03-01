package excersises.fascade;

import java.util.List;

public class LastNameDisplayStrategy implements DisplayStrategy {

    @Override
    public void display(List<Person> persons) {
        persons.stream().map(Person::getLastName).forEach(System.out::println);
    }
}
