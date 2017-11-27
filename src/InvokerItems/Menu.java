package InvokerItems;

import java.util.*;

public class Menu {

    private ArrayList<MenuItem> menu;

    public Menu() {
        menu = new ArrayList<>();

    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        menu.remove(item);
    }

    public void fillMenu() {
        menu.add(new MenuItem(14, "Burger", 15.99));
        menu.add(new MenuItem(16, "Sandwich", 12.99));
        menu.add(new MenuItem(18, "Salad", 10.99));
    }

    public MenuItem getMenuItem(int x) {
        MenuItem item;
        item = menu.get(x);
        return item;
    }

    public int totalMenuItems() {
        return menu.size();
    }


    public Iterator<MenuItem> iterator() {
        return new MenuIterator();
    }


    private class MenuIterator implements Iterator<MenuItem> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return !(index >= menu.size() || menu.get(index) == null);
        }

        @Override
        public MenuItem next() {
            return menu.get(index++);
        }
    }
}
