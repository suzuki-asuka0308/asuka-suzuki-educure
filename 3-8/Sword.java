public class Sword extends Weapon {
    // コンストラクタ（名前と攻撃力を受け取り、親クラスのコンストラクタを呼ぶ）
    public Sword(String name, int power) {
        super(name, power);
    }
    //extends Weapon を使うことで Sword は Weapon のすべての機能を継承する。
    /*Weapon クラスの name や power のフィールド、getName() や getPower() 
    のメソッドを Sword でもそのまま使える！*/
    //extends を使うと、親クラスの機能をそのまま使える！
    //super(name, power); は、親クラス（Weapon）のコンストラクタを呼び出す！
    //これによって、Weapon の name と power に値をセットできる。
    //super(...) を使うと、親クラスの初期化ができる！
}

/*この Sword クラスは、Weapon を継承しているだけ で、新しいフィールドやメソッドを追加していない。
つまり、Sword は Weapon クラスとまったく同じ機能を持っている！ */
//Sword は Weapon の派生クラスだけど、機能はそのまま！

/*項目
覚えること
継承 (extends)
Sword は Weapon の機能をそのまま使える
super(...) の使い方
super(...) で親クラスのコンストラクタを呼び出す
Sword は Weapon と同じ
何も追加していないので、Weapon のクラスと同じ動きをする
 */

 //extends を使うと、共通の機能を親クラスにまとめられる！
 //super(...) を使うと、親クラスのコンストラクタをそのまま呼べる！
 