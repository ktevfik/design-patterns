package creational.factory;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 01:56
 */
public class User {
    private String name;
    private String email;
    private String phone;

    private User() {
    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
