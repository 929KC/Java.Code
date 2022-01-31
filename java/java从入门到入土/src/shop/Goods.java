package shop;

public class Goods {
    private   int id;
    private  String name;
    private  double price;
    private  int BuyNumber;

    public Goods() {

    }

    public Goods(int id, String name, double price, int buyNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        BuyNumber = buyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return BuyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        BuyNumber = buyNumber;
    }
}
