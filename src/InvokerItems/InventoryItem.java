package InvokerItems;

public class InventoryItem {

    private String item;
    private int quantity;

    public InventoryItem(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return item + " | " + quantity;
    }
}
