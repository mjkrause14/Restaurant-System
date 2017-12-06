package Observers;

public class InventoryObserver implements Observer{

    private Subject subject;

    public InventoryObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void update() {
        System.out.println(subject.getItem() + " New Quantity: " + subject.getQuantity());
    }
}
