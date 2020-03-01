package studentteacherproject;

public class DisplayContext {

    private DisplayStrategy displayStrategy;

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void display(Person person) {
        displayStrategy.display(person);
    }

}
