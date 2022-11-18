package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:41
 */
// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
public abstract class ObservableProduct {
    protected ProductUpdateMessage message;
    private List<IObserverUser> users;

    public ObservableProduct() {
        users = new ArrayList<IObserverUser>();
        message = new ProductUpdateMessage();
    }

    public void addObserver(IObserverUser observerUser) {
        users.add(observerUser);
    }

    public void removeObserver(IObserverUser observerUser) {
        users.remove(observerUser);
    }

    public void notifyObserver() {
        for (IObserverUser user : users) {
            user.sendNotification(message);
        }
    }
}