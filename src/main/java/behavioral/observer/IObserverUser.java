package behavioral.observer;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:40
 */
// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
public interface IObserverUser {
    void sendNotification(ProductUpdateMessage message);
}