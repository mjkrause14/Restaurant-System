package MealBuilder;

public class ChickenSalad extends SaladBuilder {

    public void buildLettuce() {
        salad.setLettuce("lettuce");
    }

    public void buildExtra() {
        salad.setExtra("chicken");
    }
    public void buildDressing() {
        salad.setDressing("ceasar");
    }

}
