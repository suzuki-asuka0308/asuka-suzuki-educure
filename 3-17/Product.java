public class Product { // 商品（Product）というクラスを作ります
    // 商品名と在庫数を、このクラスの中だけで使えるようにします（外から勝手に変更できないようにする）
    private String name;  // 商品名（文字のデータ）
    private int stock;    // 在庫数（数字のデータ）

    // コンストラクタ（最初に商品を作るときに、名前と在庫数をセットする特別なメソッド）
    public Product(String name, int stock) {
        this.name = name;   // 渡された名前を、このクラスのnameに保存する
        this.stock = stock; // 渡された在庫数を、このクラスのstockに保存する
    }

    // 商品名を外から見るためのメソッド（中のnameを返すだけ）
    public String getName() {
        return name;  // 商品名を返す（呼び出し元に渡す）
    }

    // 在庫数を外から見るためのメソッド（中のstockを返すだけ）
    public int getStock() {
        return stock; // 在庫数を返す
    }

    // 在庫を追加するメソッド（amountで渡された数だけ増やす）
    public void addStock(int amount) {
        // もし追加する数が0以下だったらエラーを表示して何もしない
        if (amount <= 0) {
            System.out.println("エラー: 正の整数で在庫を追加してください");
            return; // ここで処理を終わらせる
        }
        stock += amount; // 在庫数にamountを足す（在庫を増やす）
        System.out.println(amount + "個追加しました"); // 追加した個数を表示
    }

    // 在庫を減らす（販売する）メソッド
    public void removeStock(int amount) {
        // もし販売数が0以下だったらエラーを表示して何もしない
        if (amount <= 0) {
            System.out.println("エラー: 正の整数で販売数を指定してください");
            return; // 処理を中断
        }

        // 在庫が足りていれば、在庫からamountを引く（販売）
        if (stock >= amount) {
            stock -= amount; // 在庫を減らす
            System.out.println(amount + "個販売しました"); // 売れた個数を表示
        } else {
            // 在庫が足りなければエラーメッセージ
            System.out.println("エラー: 在庫が不足しています");
        }
    }
}