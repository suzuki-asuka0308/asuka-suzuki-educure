public class Product {
    // 商品名を表すフィールド（クラス内だけで使用）
    private String name;
    
    // 価格を表すフィールド（クラス内だけで使用）
    private int price;

    // コンストラクタ：商品名と価格を受け取って初期化する
    public Product(String name, int price) {
        this.name = name;   // フィールドnameに引数nameを代入
        this.price = price; // フィールドpriceに引数priceを代入
    }

    // toStringメソッドをオーバーライド（上書き）
    // このオブジェクトを文字列として出力したときの表現を定義する
    @Override
    public String toString() {
        // 「商品名：◯◯（△△円）」という形式の文字列を返す
        return "商品名：" + name + "（" + price + "円）";
    }
}