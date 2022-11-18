package behavioral.observer;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:42
 */
// Bildirilecek olan nesnelere paremetre olarak giden mesaj.
class ProductUpdateMessage {
    public String productName;
    public String message;

    @Override
    public String toString() {
        return String.format("%s  updated. Message:%s", productName, message);
    }
}