public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] quantities = {1, 2, 3};
        int[] totals = calculateTotalAmount(prices, quantities);

        System.out.print("商品価格: [");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("]");

        System.out.print("数量: [");
        for (int quantity : quantities) {
            System.out.print(quantity + " ");
        }
        System.out.println("]");

        System.out.print("合計金額: [");
        for (int total : totals) {
            System.out.print(total + " ");
        }
        System.out.println("]");
    }

    public static int[] calculateTotalAmount(int[] prices, int[] quantities) {
        int[] totals = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int subtotal = prices[i] * quantities[i];
            int tax = (int)(subtotal * 0.08);
            totals[i] = subtotal + tax;
        }

        return totals;
    }
}