package Adapter;

import MealBuilder.EntreeBuilder;
import InvokerItems.Menu;
import InvokerItems.MenuItem;

public class MenuAdapter {

    private EntreeBuilder entree;
    private Menu menu;
    private Menu newMenu;

    public MenuAdapter(EntreeBuilder entree, Menu menu) {
        this.entree = entree;
        this.menu = menu;
        newMenu = new Menu();
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

        switch(itemCode){
            case 14:
                item.setEntree(entree.entreeType());
                newMenu.addMenuItem(item);
                break;
            case 16:
                item.setEntree(entree.entreeType());
                break;
            case 18:
                item.setEntree(entree.entreeType());
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
