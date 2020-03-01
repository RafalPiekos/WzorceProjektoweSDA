package facade;

public class User {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void register() {
        System.out.println("Registering the user ...");
    }

    public void sendMail() {
        System.out.println("Sending e-mail ...");
    }

    public void delete() {
        System.out.println("Deleting user ...");
    }

}
