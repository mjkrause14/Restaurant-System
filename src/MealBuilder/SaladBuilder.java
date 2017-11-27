package MealBuilder;

public abstract class SaladBuilder {

    protected Salad salad;

    public Salad getSalad() {
        return salad;
    }

    public void makeSalad() {
        salad = new Salad();
    }

    public String toString() { return salad.entreeType(); }

    public abstract void buildLettuce();
    public abstract void buildExtra();
    public abstract  void buildDressing();
}
