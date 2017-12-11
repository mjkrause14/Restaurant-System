package InvokerItems;

import java.util.Iterator;

public interface SubMenu {
    void fillMenu();
    int size();
    void removeItem(SubMenuItem subMenuItem);
    Iterator<SubMenuItem> iterator();
    Iterator<SubMenuItem> itemIterator(String itemName);
}
