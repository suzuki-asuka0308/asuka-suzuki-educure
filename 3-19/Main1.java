// Main1 クラス（プログラムの実行が始まる場所）を定義
public class Main1 {

    // main メソッド：プログラムのスタート地点
    public static void main(String[] args) {

        // Product クラスのインスタンス（実体）を作成して、変数 product に入れる
        // 商品名は "コーヒー"、価格は 380円で初期化される
        Product product = new Product("コーヒー", 380);

        // product を出力する（printする）と、自動的に product.toString() が呼び出される
        // Product クラスで toString() をオーバーライドしているため、
        // 「商品名：コーヒー（380円）」の形式で出力される
        System.out.println(product);
    }
}