package Observers;


import java.util.*;

public class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private int quantity;
    private String item;

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

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
