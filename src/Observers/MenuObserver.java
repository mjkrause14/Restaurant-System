package Observers;

import InvokerItems.SubMenuItem;

import java.util.Iterator;

public class MenuObserver implements Observer {

    private Subject subject;

    public MenuObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void update() {
        Iterator<SubMenuItem> itemItr = subject.getSubMenu().itemIterator(subject.getItemName());
        SubMenuItem subMenuItem;

        while(itemItr.hasNext()){
            subMenuItem = itemItr.next();
            subject.getSubMenu().removeItem(subMenuItem);
        }
    }
}
