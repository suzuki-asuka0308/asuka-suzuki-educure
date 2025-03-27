// 必要なインポート文を記載
import java.util.HashMap; // HashMapを使うための準備

public class Main3 {
    public static void main(String[] args) {
        // 商品名（文字列）と在庫数（整数）を管理するHashMapを作成
        HashMap<String, Integer> stock = new HashMap<>();

        // 商品を入荷（在庫を追加）
        stock.put("おにぎり", 15);      // おにぎりを15個入荷
        stock.put("サンドイッチ", 8);   // サンドイッチを8個入荷
        stock.put("お弁当", 5);         // お弁当を5個入荷

        // 現在の在庫状況を表示（Mapの中身をそのまま出力）
        System.out.println("在庫状況: " + stock);

        // おにぎりを1個販売（在庫を1減らす処理）

        // おにぎりの現在の在庫数を取得
        int currentStock = stock.get("おにぎり");

        // 在庫数から1個減らす
        currentStock = currentStock - 1; // もしくは currentStock--

        // 減らした在庫数をHashMapに上書き
        stock.put("おにぎり", currentStock);

        // 販売したことを表示
        System.out.println("おにぎりを1個販売しました");

        // 更新後の在庫状況を表示
        System.out.println("在庫状況: " + stock);

        // 「アイスクリーム」という商品が在庫にあるかを確認
        boolean hasIce = stock.containsKey("アイスクリーム");

        // アイスクリームの在庫の有無を表示（true/falseで返る）
        System.out.println("アイスクリームは在庫がありますか？: " + hasIce);
    }
}