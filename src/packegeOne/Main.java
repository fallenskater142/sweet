package packegeOne;

public class Main {
    public static void main(String[] args) {
      Candyes candy = new Candy();
      Candyes jelly = new Jelly();
      Candyes etc = new Etc();
      Box box = new Box();
      box.add(candy);
      box.add(jelly);
      box.add(etc);
      box.del();
     box.showAll();
     box.showPrice();
     box.showSize();
     box.delIndex(0);
     box.showAll();
     box.del();
     box.showAll();



    }
}
