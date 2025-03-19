public class Warrior extends Character {
    private String job = "戦士";
    /*extends Character を使うことで、
    Character の機能（name, hp, showStatus()）をそのまま使える！*/
    //Character には job（職業）はないので、Warrior クラスで追加している！
    //extends を使うと、親クラスのデータやメソッドをそのまま継承できる！

    // コンストラクタ（名前とHPを親クラスに渡す）
    public Warrior(String name, int hp) {
        super(name, hp); // 親クラスのコンストラクタを呼び出す
        //super(name, hp); を使うことで、親クラス（Character）のコンストラクタを実行！
        //これにより、name と hp が Character のフィールドにセットされる
        //super(...) を書かないと、Character のコンストラクタが実行されず、エラーになる！
        //super(...) を使うことで、親クラスの初期化処理をそのまま利用できる！


    }

    // 親クラスの showStatus() をオーバーライドし、職業も表示
    @Override
    public void showStatus() {
        super.showStatus(); // 親クラスの showStatus() を呼び出す
        System.out.println("職業：" + job);
        //@Override をつけることで、親クラスの showStatus() を上書き！
        //super.showStatus(); を呼び出すことで、親クラスの showStatus() をそのまま利用できる！
        /*super.showStatus(); を使うことで、親クラスの処理を再利用しつつ、
        新しい情報（職業）を追加できる！ */
        //super を使うと、親の処理を省略せずに活かせる！
        //extends で親クラスを継承できる
        //super(...) で親クラスのコンストラクタを呼び出せる！
        //super.showStatus(); を使うと、親のメソッドをそのまま利用できる

    }
}
/*項目
覚えること
extends Character
Warrior は Character の機能を継承する
super(...) を使う
Character のコンストラクタを呼び出し、name と hp を初期化
オーバーライド (@Override)
showStatus() を上書きして、親クラスの情報＋職業を表示
super.showStatus(); を使う
親クラスの showStatus() をそのまま使いつつ、追加の情報を出力
 */

 //super を使うと、親クラスのメソッドをそのまま利用できる！
 //オーバーライドを使うと、親クラスのメソッドを変更しつつ、新しい情報を追加できる！
 //super.showStatus(); を使うと、元の showStatus() の処理を変更せずに再利用できる！
 /*Character の showStatus() を Warrior で上書きし、super で親のメソッドも使う！」
→ 「super を使うと、親のメソッドをそのまま利用しつつ、追加情報を加えられる！ */