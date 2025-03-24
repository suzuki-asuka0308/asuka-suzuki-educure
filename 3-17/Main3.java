public class Main3 { // Main3という名前のクラス（メイン処理を書く場所）
    public static void main(String[] args) { // プログラムのスタート地点（必ずここから動く）

        // 【要件6-1】「りんご」という名前、在庫100個の商品を作って、それをproductという名前で保存
        Product product = new Product("りんご", 100);

        // 「商品名: りんご」と画面に表示する（getName()で中の名前を取り出す）
        System.out.println("商品名: " + product.getName());

        // 【要件6-2】「在庫数: 100個」と表示する（getStock()で在庫数を取り出す）
        System.out.println("在庫数: " + product.getStock() + "個");

        // 【要件6-3】在庫から50個売る（販売）処理
        product.removeStock(50);

        // 商品名をもう一度表示（確認）
        System.out.println("商品名: " + product.getName());

        // 販売後の在庫数（100→50になってるはず）を表示
        System.out.println("在庫数: " + product.getStock() + "個");

        // 【要件6-4】在庫に10個追加する
        product.addStock(10);

        // 商品名を表示（変わってないけど、確認のため）
        System.out.println("商品名: " + product.getName());

        // 追加後の在庫数を表示（50→60になってるはず）
        System.out.println("在庫数: " + product.getStock() + "個");

        // 【要件6-5】在庫が60しかないのに100個売ろうとする（わざとエラーになるテスト）
        product.removeStock(100); // → エラー: 在庫が不足しています が出る
    }
}