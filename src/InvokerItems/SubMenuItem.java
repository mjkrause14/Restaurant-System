package InvokerItems;

public class SubMenuItem {

    private int itemNum;
    private String itemName;

    public SubMenuItem(int itemNum, String itemName) {
        this.itemNum = itemNum;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public String toString() {
        return itemNum + "-" + itemName;
    }
}
