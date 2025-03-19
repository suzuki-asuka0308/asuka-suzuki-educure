public class Slime extends Monster {
    // attack() メソッドをオーバーライド
    @Override
    public void attack() {
        System.out.println("スライムが体当たりをした！");
        //extends Monster を使って、Slime クラスは Monster の機能をすべて引き継ぐ！
        //Monster クラスの attack() を持っているが、Slime クラスで上書きして違う動作にする！
        //extends を使うと、親クラスのメソッドをそのまま使える！
        //親クラス（Monster）にも attack() があるが、Slime では違う動作にしたい！
        //@Override をつけることで、正しくオーバーライドしていることを保証！
        //@Override をつけることで、間違ったオーバーライドを防ぐ


    }
}

 /*項目
覚えること
extends Monster
Slime は Monster の機能を継承する
オーバーライド (@Override)
親クラスの attack() を子クラスで上書きする
attack() の違い
Monster → 「モンスターの攻撃！」 / Slime → 「スライムが体当たりをした！」
 */