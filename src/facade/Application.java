package facade;

public class Application {

    public static void main(String[] args) {

        User user = new User();
        user.register();

        UserFacade userFacade = new UserFacade();
        userFacade.registerUser(user);

        userFacade.register("John", "Doe");

    }

}
