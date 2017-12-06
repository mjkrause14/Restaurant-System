package Observers;


import java.util.*;

public class Subject implements SubjectInterface {

    private ArrayList<Observer> observers;
    private int quantity;
    private String item;

    public Subject() {
        observers = new ArrayList<>();
    }
    public int getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }

    public void setQuantity(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        notifyObservers();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
