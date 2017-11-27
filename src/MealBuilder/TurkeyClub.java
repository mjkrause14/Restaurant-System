package MealBuilder;

public class TurkeyClub extends SandwichBuilder {

    public void buildBread() {
        sandwich.setBread("wheat");
    }

    public void buildMeat() {
        sandwich.setMeat("turkey");
    }

    public void buildExtra() {
        sandwich.setExtra("lettuce");
    }

}
