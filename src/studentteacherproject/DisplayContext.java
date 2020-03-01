package studentteacherproject;

import java.util.List;

public class DisplayContext {

    private DisplayStrategy displayStrategy;

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void display(List<Person> persons) {
        displayStrategy.display(persons);
    }

}
