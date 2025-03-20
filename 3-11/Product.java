// 抽象クラス（Product）を定義
public abstract class Product {
    protected String name;  // 商品名
    protected int price;    // 価格
    //共通する機能は持つけど、詳細は子クラスで決める
    //このクラス単体ではインスタンス化（new でオブジェクト作成）できない！
    //Product は直接使えず、継承して使うクラス！

    // コンストラクタ（商品名と価格を初期化）
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        //親クラスのコンストラクタは、子クラスの super(...) で呼び出せる
        
    }

    // 商品情報を表示する抽象メソッド（実装は子クラスに任せる）
    public abstract void displayInfo();

    // 在庫チェックを行う抽象メソッド（実装は子クラスに任せる）
    public abstract boolean checkStock();


    //abstract をつけると「子クラスで必ず実装しなければならない」
    //商品ごとに displayInfo() の出し方が違う」「在庫の管理方法が違う」
    //	だから、abstract で子クラスにオーバーライドを強制する！
    //共通のメソッドを作るけど、詳細は子クラスに任せる！

}