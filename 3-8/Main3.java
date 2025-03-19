public class Main3 {
    public static void main(String[] args) {
        // Warrior のインスタンスを作成
        Warrior warrior = new Warrior("アレックス", 100);
        //Warrior クラスのコンストラクタが実行される
        //super(name, hp); によって Character のコンストラクタが呼び出される
        //この結果、name に "アレックス"、hp に 100 がセットされる
        //super(name, hp); によって Character の初期化処理を利用している！

        // ステータスを表示（オーバーライドされた showStatus() が呼ばれる）
        warrior.showStatus();
        //showStatus() は Warrior でオーバーライドされている
        //まず super.showStatus(); により Character の showStatus() が実行
    }
}

//super.showStatus(); を使うと、親クラスの showStatus() を活かしつつ、新しい情報を追加できる！
//Warrior の showStatus() は Character の showStatus() を拡張するためのもの！NNNs