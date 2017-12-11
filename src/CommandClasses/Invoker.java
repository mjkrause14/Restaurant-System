package CommandClasses;

import InvokerItems.*;
import InvokerItems.Inventory;

public class Invoker {

    private Aggregator agg;

    public Invoker(Menu menu, Orders order, Tab tab, Inventory inventory, BurgerMenu burgerMenu, SandwichMenu sandwichMenu, SaladMenu saladMenu) {
        agg = new Aggregator(menu, order, tab, inventory, burgerMenu, sandwichMenu, saladMenu);
    }
    public OrderItem addOrders(int itemNum) {
        return new CMDAddOrder(agg, itemNum).execute();
    }

    public Orders getOrders() {
        return new CMDGetOrders(agg).execute();
    }

    public Menu getMenu() {
        return new CMDGetMenu(agg).execute();
    }

    public Tab getTab() {
        return new CMDGetTab(agg).execute();
    }

    public Inventory getInventory() {
        return new CMDGetInventory(agg).execute();
    }

    public BurgerMenu getBurgerMenu() {
        return new CMDGetBurgerMenu(agg).execute();
    }

    public SandwichMenu getSandwichMenu() {
        return new CMDGetSandwichMenu(agg).execute();
    }

    public SaladMenu getSaladMenu() {
        return new CMDGetSaladMenu(agg).execute();
    }
}
