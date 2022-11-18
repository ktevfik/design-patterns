package creational.factory;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 01:58
 */
public class NotifyFactory {
    public INotify createNotify(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        if (channel.equalsIgnoreCase("SMS")) {
            return new SmsNotify();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotify();
        }
        return null;
    }
}

