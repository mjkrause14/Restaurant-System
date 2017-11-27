package MealBuilder;

public class Salad implements EntreeBuilder{

    private String lettuce;
    private String extra;
    private String dressing;

    public Salad() {
        lettuce = "";
        extra = "";
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getExtra() {
        return extra;
    }

    public String getDressing() {
        return dressing;
    }

    public String[] ingredients() {
        String[] lines = new String[3];
        lines[0] = getLettuce();
        lines[1] = getExtra();
        lines[2] = getDressing();
        return lines;
    }

    public String entreeType() {
        switch(getExtra()) {
            case "chicken":
                return "Chicken Salad";
            case "tomatoes":
                return "Veggie Salad";
            default:
                return "Unlisted Salad";
        }
    }
}
