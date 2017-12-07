package InvokerItems;

public class MenuItem {
    private int itemNum;
    private String entree;
    private double price;

    public MenuItem(int itemNum, String entree, double price) {
        this.itemNum = itemNum;
        this.entree = entree;
        this.price = price;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String getEntree() {
        return entree;
    }

    public double getPrice() {
        return price;
    }

    public void setEntree(String newEntree) {
        this.entree = newEntree;
    }

    public String toString() {
        return "Item Number: " + itemNum + "\n" + "Entree: " + entree + "\n" + "Price: " + price + "\n";
    }
}