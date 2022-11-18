package behavioral.observer;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:42
 */
// Observer sınıfından türer.
class Samsung extends ObservableProduct {

    // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
    public void changePrice() {
        // Ürün fiyatlarının güncellenmesi vs.

        this.message.productName = "Samsung";
        this.message.message = "Samsung's price updated.";
        this.notifyObserver();
    }
}