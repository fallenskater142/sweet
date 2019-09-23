package packegeOne;

public class Candy extends Candyes {
    private String name = "Candy";
    private double size = 10.5;
    private int price = 5;
    private double  Coll = 10;

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
        return Coll;
    }
}
