package MealBuilder;

public class HamAndCheese extends SandwichBuilder{

    public void buildBread() {
        sandwich.setBread("oatmeal");
    }

    public void buildMeat() {
        sandwich.setMeat("ham");
    }

    public void buildExtra() {
        sandwich.setExtra("cheese");
    }

}
