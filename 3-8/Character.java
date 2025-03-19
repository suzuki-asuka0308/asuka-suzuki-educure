public class Character {
    protected String name;
    protected int hp;
    //protected を使うことで、子クラス (Warrior) から name や hp にアクセスできる！
    //private にすると、子クラスで直接 name や hp を使えなくなる！
    //public にすると、どのクラスからも変更できてしまい、カプセル化が崩れる！
    //protected は、親クラスのデータを子クラスで使えるようにするためのもの！

    // コンストラクタ（名前とHPを初期化）
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        //new Character("アレックス", 100); を実行すると、name と hp に値がセットされる！
        /*this.name = name; で、引数の name をクラスの name に代入している！ */
        //super(name, hp); を使うと、子クラス (Warrior) でこのコンストラクタを再利用できる！
        //コンストラクタを作ることで、キャラクター作成時にデータを自動でセットできる！
    }

    // キャラクターのステータスを表示するメソッド
    public void showStatus() {
        System.out.println("名前：" + name);
        System.out.println("HP: " + hp);
        //showStatus() メソッドでステータスを表示（子クラスでオーバーライドされる！）
        //親クラスの showStatus() は基本のステータス表示をする！
        //showStatus() を呼び出すと、キャラクターの名前とHPが表示される！
        /*子クラス (Warrior) でオーバーライドして super.showStatus(); を使うと、
        親クラスの showStatus() の処理をそのまま利用できる！*/
        //showStatus() を使うと、キャラクターの基本情報を表示できる！
    }
}

/*項目
覚えること
protected の意味
子クラスでも name と hp を使えるようにする
コンストラクタの役割
キャラクターの name と hp を初期化
showStatus() の役割
名前とHPを表示する（子クラスでオーバーライド可能）*/

//protected を使うと、子クラスでデータをそのまま使える！
//コンストラクタを作ることで、オブジェクト作成時に自動でデータをセットできる！
/*showStatus() を子クラスでオーバーライドすれば、親クラスの表示に追加情報を加えられる！ */
//この Character クラスは、子クラス (Warrior など) に共通する基本情報を持つためのもの！
