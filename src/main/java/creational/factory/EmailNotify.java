package creational.factory;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 01:57
 */
public class EmailNotify implements INotify {
    @Override
    public void notifyUser(User user) {
        System.out.println(
                "Mail notification sent to " + user.getEmail()
                        + " for user " + user.getName());
    }

}
