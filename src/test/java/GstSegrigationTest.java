import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GstSegrigationTest {
    purchase item;
    @Test
    public void getGstEligibleItems(){
        item=new purchase();
        Mobile mobile=new Mobile("mi",28,20000.0f);
        Laptop laptop=new Laptop("apple",28,50000.00f);
        item.addItems(mobile,laptop);
        List<items> gstItems=item.getAllGstItems();
        for (items item1:gstItems){
            Assert.assertTrue(item1 instanceof Mobile||item1 instanceof Laptop);
        }
    }
    @Test
    public void GetTotalPriceofItemsIncludingGst(){
        item=new purchase();
        Mobile mobile=new Mobile("mi",28,20000.0f);
        Laptop laptop=new Laptop("apple",28,50000.00f);
        item.addItems(mobile,laptop);
        List<items> item=new ArrayList<>();
        for(items item1:item){
            Assert.assertTrue(item1 instanceof Mobile||item1 instanceof Laptop);
        }
    }
    @Test
    public void ItemPriceMoreThan2000(){
        item=new purchase();
        Mobile mobile=new Mobile("mi",28,20000.0f);
        Laptop laptop=new Laptop("apple",28,50000.00f);
        item.addItems(mobile,laptop);
        List<items> item=new ArrayList<>();
        for(items item1:item){
            Assert.assertTrue(item1 instanceof Mobile||item1 instanceof Laptop);
}

}

}

