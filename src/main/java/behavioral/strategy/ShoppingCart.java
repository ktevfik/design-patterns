package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:08
 */
// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
class ShoppingCart {
    private List<Item> items;
    private IPayment payment;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void setPaymentMethod(IPayment payment) {
        this.payment = payment;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay() {
        int amount = calculateTotal();
        this.payment.pay(amount);
    }
}