package CommandClasses;

import InvokerItems.*;

public class Aggregator {

    private Menu menu;
    private Orders orders;
    private Tab tab;
    private Inventory inventory;
    private BurgerMenu burgerMenu;
    private SandwichMenu sandwichMenu;
    private SaladMenu saladMenu;

    public Aggregator(Menu menu, Orders orders, Tab tab, Inventory inventory, BurgerMenu burgerMenu, SandwichMenu sandwichMenu, SaladMenu saladMenu) {
        this.menu = menu;
        this.orders = orders;
        this.tab = tab;
        this.inventory = inventory;
        this.burgerMenu = burgerMenu;
        this.sandwichMenu = sandwichMenu;
        this.saladMenu = saladMenu;
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

    public BurgerMenu getBurgerMenu() {
        return burgerMenu;
    }

    public SandwichMenu getSandwichMenu() {
        return sandwichMenu;
    }

    public SaladMenu getSaladMenu() {
        return saladMenu;
    }
}
