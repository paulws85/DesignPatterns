package excersises.userRegistration;

import java.util.List;

public class DisplayContext {

    DisplayStrategy displayStrategy;

    public DisplayContext() {
        this.displayStrategy = null;
    }

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void display(List<Person> persons) {
        displayStrategy.display(persons);

    }
}
