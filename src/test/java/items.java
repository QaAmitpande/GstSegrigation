public class items {
    public String brand;
    public int gstrate;
    public float price;

    public items(String brand, float price, float gstrates) {
        this.brand = brand;
        this.gstrate = gstrate;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getGstrates() {
        return gstrate;
    }

    public float getPrice() {
        return price;
    }
}
