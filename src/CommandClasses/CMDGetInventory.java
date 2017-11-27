package CommandClasses;

import InvokerItems.Inventory;

public class CMDGetInventory implements Command {

    private Aggregator agg;

    public CMDGetInventory(Aggregator agg) {
        this.agg = agg;
    }

    public Inventory execute() {
        return agg.getInventory();
    }
}
