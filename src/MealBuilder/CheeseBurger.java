package MealBuilder;

public class CheeseBurger extends BurgerBuilder {

    public void buildPatty() {
        burger.setPatty("cheeseburger");
    }

    public void buildCondiment() {
        burger.setCondiment("bbq");
    }

    public void buildExtras() {
        burger.setExtra("bacon");
    }

}
