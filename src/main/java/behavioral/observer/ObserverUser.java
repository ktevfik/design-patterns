package behavioral.observer;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:42
 */
// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
public class ObserverUser implements IObserverUser {
    public void sendNotification(ProductUpdateMessage message) {
        System.out.println(message.toString());
    }
}