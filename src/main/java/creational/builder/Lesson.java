package creational.builder;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 02:50
 */
public class Lesson {
    public int id;
    public String name;
    public double price;
    public double discountedPrice;
    public Boolean discountApplied;
    public String lessonNote;

    public Lesson(int id, String name, double price, double discountedPrice, Boolean discountApplied, String lessonNote) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountApplied = discountApplied;
        this.lessonNote = lessonNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Boolean getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(Boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public String getLessonNote() {
        return lessonNote;
    }

    public void setLessonNote(String lessonNote) {
        this.lessonNote = lessonNote;
    }
}