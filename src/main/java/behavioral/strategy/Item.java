package behavioral.strategy;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:08
 */
// Sepette bulunan ürünleri temsil eden sınıf.
// Ürün kodu ve fiyat bilgileri temel olarak yeterlidir.
class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}