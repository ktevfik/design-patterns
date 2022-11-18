package creational.singleton;

/**
 * @author Tevfik Kadan
 * @created 17/11/2022 - 23:44
 */
public class App {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
