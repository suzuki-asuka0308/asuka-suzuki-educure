public class Main1 {
    public static void main(String[] args) {
        // 売上データ（仮の数値）
        int[] sales = {1000, 2000, 1500, 1800, 2200};
        
        // 売上合計を格納する変数
        int totalSales = 0;
        // ここにコードを書いてください

        for (int i = 0; i < 5; i++) {
            totalSales += sales[i];
        }

            System.out.println("売上合計" + totalSales + "円");
        
    }
}