public class Main1 {
    public static void main(String[] args) {
        int price = 1000;  // 商品価格
        int quantity = 3;  // 数量
        // ここにコードを書いてください
        int totalAmount = calculateTotal(price,quantity);

        System.out.println("商品価格:" + price + "円 数量:" + quantity);
        System.out.println("合計金額(税込):" + totalAmount + "円");

    }


        public static int calculateTotal(int price, int quantity) {
            int subtotal = price * quantity;
            int tax = (int)(subtotal * 0.08);
            return subtotal  + tax;
    }
}