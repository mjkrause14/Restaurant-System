package InvokerItems;

import MealBuilder.EntreeBuilder;
import Observers.*;

import java.util.*;

public class Inventory {

    private ArrayList<InventoryItem> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void fillInventory() {
        inventory.add(new InventoryItem("lettuce",75));
        inventory.add(new InventoryItem("tomatoes",50));
        inventory.add(new InventoryItem("pickles",50));
        inventory.add(new InventoryItem("ham",50));
        inventory.add(new InventoryItem("turkey",50));
        inventory.add(new InventoryItem("chicken",50));
        inventory.add(new InventoryItem("hamburger",50));
        inventory.add(new InventoryItem("cheeseburger",50));
        inventory.add(new InventoryItem("veggie",50));
        inventory.add(new InventoryItem("bacon",50));
        inventory.add(new InventoryItem("bbq",50));
        inventory.add(new InventoryItem("ketchup",50));
        inventory.add(new InventoryItem("mustard",50));
        inventory.add(new InventoryItem("oatmeal",50));
        inventory.add(new InventoryItem("wheat",50));
        inventory.add(new InventoryItem("cheese",75));
        inventory.add(new InventoryItem("caesar",50));
        inventory.add(new InventoryItem("balsamic",50));
    }

    public void decrementInv(String ingredient) {
        Subject subject = new Subject();
        int quantity;
        new InventoryObserver(subject);

        for(InventoryItem item : inventory) {
            if ((item.getItem().equals(ingredient) && item.getQuantity() >= 1)) {
                quantity = item.getQuantity();
                quantity = quantity - 1;
                item.setQuantity(quantity);
                subject.setQuantity(item.getItem().toUpperCase(), quantity);
            } else if (item.getItem().equals(ingredient) && item.getQuantity() < 1) {
                item.setQuantity(0);
                subject.setQuantity(item.getItem().toUpperCase(), 0);
            }
        }
    }

    public void updateInv(EntreeBuilder itemName) {
        for(String items : itemName.ingredients()) {
            decrementInv(items);
        }
    }

    public void checkInventory(EntreeBuilder itemName, SubMenu subMenu) {
        Subject subject = new Subject();

        new MenuObserver(subject);

        for(String items : itemName.ingredients()) {
            for(InventoryItem item : inventory) {
                if(item.getItem().equals(items) && item.getQuantity() == 0)
                    subject.setMenuItem(subMenu, itemName.entreeType().toLowerCase());
            }
        }
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public Iterator<InventoryItem> iterator() {
        return new invIterator();
    }

    private class invIterator implements Iterator<InventoryItem> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return !((index >= inventory.size() || inventory.get(index) == null));
        }

        @Override
        public InventoryItem next() {
            return inventory.get(index++);
        }
    }
}
