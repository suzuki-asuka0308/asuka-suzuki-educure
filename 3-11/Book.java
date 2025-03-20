// Productを継承したBookクラスを作成
public class Book extends Product {
    private String author; // 著者
    private int stockQuantity; // 在庫数

    //extends Product を使うことで、Product の機能（name, price）を継承
    //Product で定義されている displayInfo() と checkStock() をオーバーライドする必要がある！
    //Book クラスは Product のルールを守る必要がある！

    // コンストラクタ（商品名、価格、著者、在庫数を初期化）
    public Book(String name, int price, String author, int stockQuantity) {
        super(name, price); // 親クラス(Product)のコンストラクタを呼び出す
        this.author = author;
        this.stockQuantity = stockQuantity;
        //親クラス（Product）の name と price を super(name, price); でセット！
    }

    // 商品情報を表示（抽象メソッドをオーバーライド）
    @Override
    public void displayInfo() {
        System.out.println("書籍名：" + name);
        System.out.println("著者：" + author);
        System.out.println("価格：" + price + "円");
        /*親クラスで abstract void displayInfo(); 
        と定義されているので、必ずオーバーライドしないといけない！*/
        //name と price は Product から継承したフィールド
        //author は Book クラス独自のフィールドなのでここで追加！
        //Product で定義されたルール通りに displayInfo() を実装！
    }

    // 在庫チェック（抽象メソッドをオーバーライド）
    @Override
    public boolean checkStock() {
        if (stockQuantity > 0) {
            System.out.println("在庫あり");
            return true;
        } else {
            System.out.println("在庫なし");
            return false;
        }

        //stockQuantity（在庫数）が 1 以上なら「在庫あり」
        //	0 以下なら「在庫なし」を表示
        //戻り値 boolean を返しているので、true or false を返す
        //在庫チェックのルールを明確にして、必ず true or false を返す！
    }
}
//super(...) で親クラスのコンストラクタを呼ぶ」ことを理解する
//abstract メソッドはオーバーライドしないとエラーになる」ことを実感する！
//boolean は、真偽（true or false）の2つの値しか持たないデータ型。