public class Product {
    private String name;  // 商品名
    private int price;    // 価格

    // コンストラクタ（商品名と価格を初期化）
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        /*new Product("ノートパソコン", 80000); で商品を作ると、
        自動で name に「ノートパソコン」、price に 80000 が入る。*/
        //ポイント：コンストラクタは「インスタンスを作るときに、自動で初期値をセットするもの
        //コンストラクタは new したときに実行される
        //this.name = name; の this は「このクラスの name」という意味
    }

    // 商品情報を表示するメソッド
    public void displayInfo() {
        System.out.println("商品名：" + name);
        System.out.println("価格：" + price + "円");
        //displayInfo() を呼ぶと、商品名と価格を表示できる！
        //ポイント：「クラスに機能を持たせるのがメソッド！」
        /*覚えるべきこと →「get〇〇() や displayInfo() は、
        データを取得・表示するために作る！」*/
        //メソッドを作ることで、何度でも 商品情報を表示 できるようになる
    }
}