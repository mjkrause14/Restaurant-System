package MealBuilder;

public class VeggieSalad extends SaladBuilder {

    public void buildLettuce() {
        salad.setLettuce("lettuce");
    }

    public void buildExtra() {
        salad.setExtra("tomatoes");
    }
    public void buildDressing() {
        salad.setDressing("balsamic");
    }

}
