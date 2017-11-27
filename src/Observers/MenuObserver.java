package Observers;

public class MenuObserver extends Observer {

    private Subject subject;

    public MenuObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        if(subject.getQuantity() == 0) {
            System.out.println(subject.getItem() + " is out of stock");
        }
    }
}
