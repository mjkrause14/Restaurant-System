package MealBuilder;

public abstract class SandwichBuilder {

    protected Sandwich sandwich;

    public Sandwich getSandwich() {
        return sandwich;
    }

    public String toString() {
        return sandwich.entreeType();
    }
    public void makeSandwich() {
        sandwich = new Sandwich();
    }

    public abstract void buildBread();
    public abstract void buildMeat();
    public abstract void buildExtra();
}
