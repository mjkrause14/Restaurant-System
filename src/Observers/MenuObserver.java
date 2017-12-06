package Observers;

public class MenuObserver implements Observer {

    private Subject subject;

    public MenuObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void update() {
        System.out.println(subject.getItem() + " is out of stock");
    }
}
