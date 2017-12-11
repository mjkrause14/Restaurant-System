package CommandClasses;

import InvokerItems.SandwichMenu;

public class CMDGetSandwichMenu implements Command {

    private Aggregator agg;

    public CMDGetSandwichMenu(Aggregator agg) {
        this.agg = agg;
    }

    public SandwichMenu execute() {
        return agg.getSandwichMenu();
    }
}
