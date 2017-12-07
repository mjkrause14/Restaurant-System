package MealBuilder;

public class Director {

    private BurgerBuilder burger;
    private SandwichBuilder sandwich;
    private SaladBuilder salad;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        burger = burgerBuilder;
    }

    public Burger getBurger() {
        return burger.getBurger();
    }

    public void createBurger() {
        burger.makeBurger();
        burger.buildPatty();
        burger.buildCondiment();
        burger.buildExtras();
    }

    public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
        sandwich = sandwichBuilder;
    }

    public Sandwich getSandwich() {
        return sandwich.getSandwich();
    }

    public void createSandwich() {
        sandwich.makeSandwich();
        sandwich.buildBread();
        sandwich.buildMeat();
        sandwich.buildExtra();
    }

    public void setSaladBuilder(SaladBuilder saladBuilder) {
        salad = saladBuilder;
    }

    public Salad getSalad() {
        return salad.getSalad();
    }

    public void createSalad() {
        salad.makeSalad();
        salad.buildLettuce();
        salad.buildExtra();
        salad.buildDressing();
    }
}
