package CommandClasses;

import InvokerItems.*;

public class CMDAddOrder implements Command {
    private Aggregator agg;
    private int itemNum;

    public CMDAddOrder(Aggregator agg, int itemNum) {
        this.agg = agg;
        this.itemNum = itemNum;
    }

    public OrderItem execute() {
        OrderItem order = new OrderItem(itemNum);
        agg.getOrders().addOrder(order);
        return order;
    }
}
