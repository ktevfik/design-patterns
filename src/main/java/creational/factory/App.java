package creational.factory;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 01:56
 */
public class App {
    public static void main(String[] args) {
        User user = new User("Tevfik Kadan",
                                "mtevfik41@gmail.com",
                                "1234567890");
        NotifyFactory notifyFactory = new NotifyFactory();
        INotify notification = notifyFactory.createNotify("SMS");
        notification.notifyUser(user);

        notification = notifyFactory.createNotify("EMAIL");
        notification.notifyUser(user);
    }
}
