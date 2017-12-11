package CommandClasses;

import InvokerItems.SaladMenu;

public class CMDGetSaladMenu implements Command {

    private Aggregator agg;

    public CMDGetSaladMenu(Aggregator agg) {
        this.agg = agg;
    }

    public SaladMenu execute() {
        return agg.getSaladMenu();
    }
}
