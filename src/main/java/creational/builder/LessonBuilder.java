package creational.builder;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 02:52
 */
public class LessonBuilder {

    public int id;
    public String name;
    public double price;
    public double discountedPrice;
    public Boolean discountApplied;
    public String lessonNote;

    public LessonBuilder() {
    }

    public LessonBuilder(int id, String name, double price, double discountedPrice, Boolean discountApplied, String lessonNote) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountApplied = discountApplied;
        this.lessonNote = lessonNote;
    }

    public LessonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LessonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LessonBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public LessonBuilder setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public LessonBuilder setDiscountApplied(Boolean discountApplied) {
        this.discountApplied = discountApplied;
        return this;
    }

    public LessonBuilder setLessonNote(String lessonNote) {
        this.lessonNote = lessonNote;
        return this;
    }

    public Lesson build() {
        return new Lesson(id, name, price, discountedPrice, discountApplied, lessonNote);
    }

}
