package MealBuilder;

public class VeggieBurger extends BurgerBuilder {

    public void buildPatty() {
        burger.setPatty("veggie");
    }

    public void buildCondiment() {
        burger.setCondiment("mustard");
    }

    public void buildExtras() {
        burger.setExtra("lettuce");
    }

}
