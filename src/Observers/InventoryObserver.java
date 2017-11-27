package Observers;

public class InventoryObserver extends Observer{

    private Subject subject;

    public InventoryObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println(subject.getItem() + " New Quantity: " + subject.getQuantity());
    }
}
