package creational.factory;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 01:58
 */
public class SmsNotify implements INotify {
    @Override
    public void notifyUser(User user) {
        System.out.println("SMS notification sent to " + user.getPhone()
                + " for user " + user.getName());
    }
}
