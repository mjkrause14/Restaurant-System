package MealBuilder;

public class Sandwich implements EntreeBuilder{

    private String bread;
    private String meat;
    private String extra;

    public Sandwich() {
        bread = "";
        meat = "";
        extra = "";
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getExtra() {
        return extra;
    }

    public String[] ingredients() {
        String[] lines = new String[3];
        lines[0] = getBread();
        lines[1] = getMeat();
        lines[2] = getExtra();
        return lines;
    }

    public String entreeType() {
        switch(getMeat()) {
            case "ham":
                return "Ham and Cheese";
            case "turkey":
                return "Turkey Club";
            default:
                return "Unlisted Sandwich";
        }
    }
}
