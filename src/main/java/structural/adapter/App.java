package structural.adapter;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:11
 */
public class App {
    public static void main(String[] args) {
        CustomOperation customOperation = new CustomOperation(new CustomSerializerAdapter());
        String serializedObject = customOperation.serializeObject(new Object());
        System.out.println(serializedObject);
    }
}
