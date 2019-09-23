package packegeOne;

public class Box implements Boxinterface {
   private Candyes arr[] = new Candyes[5];
   int i =0;
    @Override
    public void add(Candyes candyes) {
        arr[i] = candyes;
        i++;

    }

    @Override
    public void del() {
for(int i=arr.length-1;i>=0;i--){
    if (arr[i]!=null){
        arr[i]=null;
        break;
    }
}
    }

    @Override
    public void delIndex( int index) {
     arr[index] = null;

    }

    @Override
    public void showPrice() {
        int allPrice =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=null){
                allPrice+=arr[i].getPrice();
            }
        }
        System.out.println("Общая цена : " +allPrice);
    }

    @Override
    public void showSize() {
        double allSize = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=null){
               allSize += arr[i].getSize();
            }
        }
        System.out.println(" Общий вес : "+ allSize);
    }

    @Override
    public void showAll() {
for(int i=0;i<arr.length;i++){
    if (arr[i]!=null){
        System.out.println(arr[i]);
    }
}
    }


}
