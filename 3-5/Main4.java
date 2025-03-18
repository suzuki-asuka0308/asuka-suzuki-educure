public class Main4 {
    public static void main(String[] args) {
        // 商品の作成（ノートパソコン, 80000円）
        Product laptop = new Product("ノートパソコン", 80000);
        //ポイント：new を使うと「オブジェクト」が作られる
        /*new Product("ノートパソコン", 80000); を実行すると、
        name に「ノートパソコン」、price に 80000 がセットされる*/
        //オブジェクトとは「データと機能を持ったもの」

        // 商品情報を表示
        laptop.displayInfo();
        //laptop の displayInfo() を実行すると、商品情報が表示される
        //ポイント：「メソッドを呼び出すと、そのクラスの機能を使える！
        //このコードでは「商品名と価格を表示する」という機能を実行している
        //laptop は Product クラスのインスタンスなので、displayInfo() を使える
        //オブジェクトを作ったら、そのメソッド（機能）を使える！
    }
}

    //Javaのプログラムは main() メソッドから実行される
    //ポイント：「プログラムの流れを意識する！」
    