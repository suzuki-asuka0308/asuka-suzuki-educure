public class GameCharacter {
    protected String name;
    protected int hp;
    //protected を使うと、子クラス（Wizard など）からアクセスできる
    //private にすると、子クラスで name や hp を直接使えなくなる。
    //public にすると、どのクラスからでも変更できてしまい、カプセル化の意味がなくなる。
    //protected は、親クラスのデータを子クラスでも使えるようにするためのもの！

    // コンストラクタ（名前とHPを初期化）
    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
        //オブジェクトが作成されるときに name（名前）と hp（HP）がセットされる！
        /*super(name, hp); を使うと、子クラス（Wizard）で
        このコンストラクタを再利用できる！ */
        //コンストラクタを作ることで、キャラクター作成時にデータを自動でセットできる！
    }

    // ステータスを表示するメソッド
    public void showStatus() {
        System.out.println("名前：" + name);
        System.out.println("HP : " + hp);
        //showStatus() を呼び出すと、キャラクターの名前とHPが表示される！
        
    }
}

/*項目
覚えること
protected の意味
子クラスでも name と hp を使えるようにする
コンストラクタの役割
キャラクターの name と hp を初期化
showStatus() の役割
名前とHPを表示する（子クラスでオーバーライド可能）
 */

 //protected を使うと、子クラスでデータをそのまま使える！
 //コンストラクタを作ることで、オブジェクト作成時に自動でデータをセットできる！
 /*showStatus() を子クラスでオーバーライドすれば、
 親クラスの情報＋追加情報（MPなど）を表示できる！*/

 /*この GameCharacter クラスは、子クラス (Wizard など) 
 に共通する基本情報を持つためのもの！ */