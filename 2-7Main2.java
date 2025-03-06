public class Main2 {
    public static void main(String[] args) {
        int price = 2500;

        int discount = (int)(price* 0.2);
        System.out.println("割引額:" + discount + "円" );
        int salePrice = price - discount;
        System.out.println("販売価格:" + salePrice + "円");
 
    }
    
}
