package MealBuilder;

public class Hamburger extends BurgerBuilder{

    public void buildPatty() {
        burger.setPatty("hamburger");
    }

    public void buildCondiment() {
        burger.setCondiment("ketchup");
    }

    public void buildExtras() {
        burger.setExtra("pickles");
    }

}
