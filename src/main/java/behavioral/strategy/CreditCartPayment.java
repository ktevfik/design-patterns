package behavioral.strategy;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:07
 */
class CreditCartPayment implements IPayment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCartPayment(String name, String ccNum, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    public void pay(int amount) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        System.out.println("Paid by credit cart.");
    }
}