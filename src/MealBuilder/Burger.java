package MealBuilder;
import MealBuilder.EntreeBuilder;

public class Burger implements EntreeBuilder{

    private String patty;
    private String condiment;
    private String extra;

    public Burger() {
        patty = "";
        condiment = "";
        extra = "";
    }

    public String getPatty() {
        return patty;
    }

    public String getCondiment() {
        return condiment;
    }

    public String getExtra() {
        return extra;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String[] ingredients() {
        String[] lines = new String[3];
        lines[0] = getPatty();
        lines[1] = getCondiment();
        lines[2] = getExtra();
        return lines;
    }

    public String entreeType() {
        switch (getPatty()) {
            case "hamburger":
                return "Hamburger";
            case "cheeseburger":
                return "CheeseBurger";
            case "veggie":
                return "VeggieBurger";
            default:
                return "Unlisted Burger";
        }
    }
}
