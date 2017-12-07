package Adapter;

import InvokerItems.Tab;
import MealBuilder.EntreeBuilder;
import InvokerItems.Menu;
import InvokerItems.MenuItem;

public class MenuAdapter {

    private EntreeBuilder entree;
    private Menu menu;
    private Tab tab;

    public MenuAdapter(EntreeBuilder entree, Menu menu, Tab tab) {
        this.entree = entree;
        this.menu = menu;
        this.tab = tab;
    }


    public MenuItem getMenuItem(int itemCode) {

        for(int x = 0; x < menu.totalMenuItems(); x++) {
            if(menu.getMenuItem(x).getItemNum() == itemCode)
                return menu.getMenuItem(x);
        }
        return null;
    }

    public void updateMenuItem(int itemCode) {
        MenuItem item = getMenuItem(itemCode);

        item.setEntree(entree.entreeType());
        tab.addItem(item.toString());
    }
}
