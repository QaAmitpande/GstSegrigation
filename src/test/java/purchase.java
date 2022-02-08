import java.util.ArrayList;
import java.util.List;

public class purchase {
    public String itemType;
    public List<items> itemList;

    public purchase() {
        itemList = new ArrayList<>();
    }

    public void addItems(items... additem) {
        ArrayList<items> gstitems = new ArrayList<>();
        for (items item : additem) {
            itemList.add(item);
        }
    }

    public List<items> getAllItem() {
        return itemList;
    }

    public ArrayList<items> getAllGstItems(items... additem) {
        ArrayList<items> gstitems = new ArrayList<>();
        for (items item : additem) {
            if (item.getGstrates() != 0)
                gstitems.add(item);
        }
        return gstitems;
    }

    public List<items> getGstItemsWithPriceGreaterThan2000(items... additem) {
        List<items> gstitems = new ArrayList<>();
        for (items item1 : additem) {
            if (totalPriceIncludingGst(item1) > 2000) {
                gstitems.add(item1);
            }
        }
        return gstitems;
    }

    public float totalPriceIncludingGst(items... additem) {
        float totalPrice = 0;
        ArrayList<items> gstItems = new ArrayList<>();
        for (items item : additem) {
            float gstAmount = (item.getPrice() * item.getGstrates()) / 100;
            totalPrice = item.getPrice() + gstAmount;
        }
        return totalPrice;
    }
}
