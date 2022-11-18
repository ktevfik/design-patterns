package creational.singleton;

/**
 * @author Tevfik Kadan
 * @created 17/11/2022 - 23:44
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
