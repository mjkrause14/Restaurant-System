package MealBuilder;

public abstract class BurgerBuilder {

    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void makeBurger() {
        burger = new Burger();
    }

    public String toString() { return burger.entreeType(); }

    public abstract void buildPatty();
    public abstract void buildCondiment();
    public abstract void buildExtras();
}
