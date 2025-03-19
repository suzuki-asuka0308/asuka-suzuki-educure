public class Wizard extends GameCharacter {
    private int mp; // 魔法力（MP）
    //extends を使うと、親クラスのデータやメソッドをそのまま継承できる


    // コンストラクタ（名前、HP、MPを設定）
    public Wizard(String name, int hp, int mp) {
        super(name, hp); // 親クラスのコンストラクタを呼び出す
        this.mp = mp; // 自分自身のMPを初期化
        //super(name, hp); を使うことで、親クラス（GameCharacter）のコンストラクタが実行
        //これにより、name と hp が GameCharacter のフィールドにセットされる
        //super(...) を書かないと、GameCharacter のコンストラクタが実行されず、エラーになる！
        //this.mp = mp; で mp を Wizard 独自のフィールドとして初期化
        //super(...) を使うことで、親クラスの初期化処理をそのまま利用できる！
    }

    // ステータス表示メソッド（親クラスの showStatus() をオーバーライド）
    @Override
    public void showStatus() {
        super.showStatus(); // 親クラスの showStatus() を呼び出す
        System.out.println("MP : " + mp);
        //@Override をつけることで、親クラスの showStatus() を上書き！
        //super.showStatus(); を呼び出すことで、親クラスの showStatus() をそのまま利用できる！
        //super.showStatus(); を使うことで、親クラスのメソッドをそのまま使いつつ、MPも表示！
    }
}


/*項目
覚えること
extends GameCharacter
Wizard は GameCharacter の機能を継承する
super(...) を使う
GameCharacter のコンストラクタを呼び出し、name と hp を初期化
オーバーライド (@Override)
showStatus() を上書きして、親クラスの情報＋MPを表示
super.showStatus(); を使う
親クラスの showStatus() をそのまま使いつつ、MPを出力
 */

 //super を使うと、親クラスのコンストラクタをそのまま利用できる！
 //オーバーライドを使うと、親クラスのメソッドを変更しつつ、新しい情報を追加できる！
 //super.showStatus(); を使うと、元の showStatus() の処理を変更せずに再利用できる！

 //GameCharacter の showStatus() を Wizard で上書きし、super で親のメソッドも使う！
 //super を使うと、親のメソッドをそのまま利用しつつ、追加情報（MP）を加えられる！
