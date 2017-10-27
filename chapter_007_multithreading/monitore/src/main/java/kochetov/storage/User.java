package kochetov.storage;

/**
 *  User.
 * Created by Сергей on 30.04.2017.
 */
public class User {
    /**
     * Name of user.
     */
    private final String name;
    /**
     * Amount of user money.
     */
    private int amount;

    /**
     * Constructor.
     * @param name - name.
     * @param amout - amount of money
     */
    User(final String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    /**
     * Getter.
     * @return amount
     */
    int getAmount() {
        return this.amount;
    }

    /**
     * Setter.
     * @param amount - amount
     */
    void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter.
     * @return name
     */
    String getName() {
        return this.name;
    }

    /**
     * for test.
     * @return tag
     */
    @Override
    public String toString() {
        return String.format("User{name=%s, amount=%s}", name, amount);

    }

}
