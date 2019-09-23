package packegeOne;

public abstract class Candyes {
   public abstract String getName();
    public abstract double getSize();
    public abstract int getPrice();
public abstract double getColl();


    @Override
    public String toString() {
        return "Имя: "+ getName() +" Цена: "+ getPrice()+ " Обьем: "+ getSize()+ " Колорийность: "+ getColl();
    }
}
