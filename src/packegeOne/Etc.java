package packegeOne;

public class Etc extends Candyes {
    private String name = "Etc";
    private double size = 7.9;
    private int price = 3;
    private double Coll = 20;

    @Override
    public String getName() {
        return name ;
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
