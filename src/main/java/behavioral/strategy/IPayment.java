package behavioral.strategy;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 04:07
 */
// Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
interface IPayment {
    void pay(int amount);
}