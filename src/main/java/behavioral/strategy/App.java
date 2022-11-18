package behavioral.strategy;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:07
 */
public class App {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("894651364", 80));
        shoppingCart.addItem(new Item("654798243", 20));

        shoppingCart.setPaymentMethod(new PaypalPayment("mtevfik41@gmail.com", "password"));
        shoppingCart.pay();

        shoppingCart.setPaymentMethod(new CreditCartPayment("John Doe", "4373093149845972", "199", "12/2024"));
        shoppingCart.pay();
    }
}
