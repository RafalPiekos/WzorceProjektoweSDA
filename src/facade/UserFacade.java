package facade;

public class UserFacade {
    public void registerUser(User user) {
        user.register();
    }

    public void register(String firsName, String lastName) {
        User user = new User();
        user.setFirstName(firsName);
        user.setLastName(lastName);
        user.register();
    }
}
