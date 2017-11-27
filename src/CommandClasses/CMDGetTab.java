package CommandClasses;

import InvokerItems.Tab;
public class CMDGetTab implements Command {
    private Aggregator agg;

    public CMDGetTab(Aggregator agg) {
        this.agg = agg;
    }

    public Tab execute() {
        return agg.getTab();
    }
}
