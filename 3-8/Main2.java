public class Main2 {
    public static void main(String[] args) {
        // モンスターの攻撃
        Monster m = new Monster();
        m.attack();
        //親クラス Monster の attack() がそのまま実行される！
        //Monster には attack() のオーバーライドはないので、そのままの動作！
        //Monster クラスの attack() は変更なしでそのまま実行！

        // スライムの攻撃（オーバーライドされたメソッドが呼ばれる）
        Slime s = new Slime();
        s.attack();
        //Slime は Monster を継承しているが、attack() をオーバーライドしている
        //そのため、Monster の attack() ではなく Slime の attack() が実行される！
        //@Override を使うことで、親クラスとは違う攻撃方法に変更できる！
        //オーバーライドされた attack() によって、Slime の攻撃動作が変わった！

    }
}

     //Monster の attack() → 「モンスターの攻撃！」
     //Slime の attack() → 「スライムが体当たりをした！」（オーバーライドされている！）
     //同じ attack() でも、どのクラスの attack() を呼ぶかで動作が変わる！

     /*項目
覚えること
new Monster()
Monster の attack() が実行される（そのまま）
new Slime()
Slime の attack() が実行される（オーバーライド）
オーバーライドの効果
「子クラスで親クラスのメソッドを上書きできる！」
 */

 //Monster の attack() は変更なし
 //Slime の attack() はオーバーライドされているので、動作が変わる！
 //オーバーライドを使うと、同じ attack() でも子クラスごとに違う動作ができる！


 //オーバーライドの動作確認をするためのプログラム！