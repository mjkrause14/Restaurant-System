package Observers;

public class InventoryObserver implements Observer{

    private Subject subject;

    public InventoryObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void update() {
        if(subject.getQuantity() >= 1) {
            System.out.println(subject.getItem() + " New Quantity: " + subject.getQuantity());
        }
        else {
            System.out.println(subject.getItem() + " is out of stock");
        }
    }
}
