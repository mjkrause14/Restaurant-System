package CommandClasses;

import InvokerItems.Menu;
import InvokerItems.Orders;
import InvokerItems.Tab;
import InvokerItems.Inventory;

public class Aggregator {

    private Menu menu;
    private Orders orders;
    private Tab tab;
    private Inventory inventory;

    public Aggregator(Menu menu, Orders orders, Tab tab, Inventory inventory) {
        this.menu = menu;
        this.orders = orders;
        this.tab = tab;
        this.inventory = inventory;
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public Tab getTab() {
        return tab;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
