package CommandClasses;

import InvokerItems.BurgerMenu;

public class CMDGetBurgerMenu implements Command {

    private Aggregator agg;

    public CMDGetBurgerMenu(Aggregator agg) {
        this.agg = agg;
    }

    public BurgerMenu execute() {
        return agg.getBurgerMenu();
    }
}
