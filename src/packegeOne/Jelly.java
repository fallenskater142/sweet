package packegeOne;

public class Jelly extends  Candyes {
    private String name = "Jelly";
    private double size = 1.7;
    private int price =2;
    private double coll = 30;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getColl() {
        return coll;
    }
}
