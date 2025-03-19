public class Main4 {
    public static void main(String[] args) {
        // Wizard のインスタンスを作成
        Wizard wizard = new Wizard("マーリン", 80, 100);

        // ステータスを表示（オーバーライドされた showStatus() が呼ばれる）
        wizard.showStatus();
    }
}

/*項目
覚えること
new Wizard(...)
super(name, hp); で GameCharacter のコンストラクタが実行される
showStatus() の動作
super.showStatus(); で親の処理を実行し、追加情報を表示
オーバーライドの効果
「親クラスのメソッドをそのまま使いつつ、新しい情報を加えられる！」
 */