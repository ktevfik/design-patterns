package creational.builder;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 02:50
 */
public class App {
    public static void main(String[] args) {
        Lesson lesson = new LessonBuilder().setId(1)
                .setName("Java")
                .setPrice(100)
                .setDiscountedPrice(50)
                .setDiscountApplied(true)
                .setLessonNote("This is a lesson note")
                .build();
    }
}
