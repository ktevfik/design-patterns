package behavioral.strategy;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:08
 */
class PaypalPayment implements IPayment {
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        System.out.println("Paid by Paypal.");
    }
}