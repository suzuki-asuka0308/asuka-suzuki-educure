public class Weapon {
    private String name;  // 武器の名前
    private int power;    // 攻撃力

    // コンストラクタ
    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
        //オブジェクトが作られるときに、名前と攻撃力の値をセットするためのメソッド。
        //new Weapon("xxx", 10); のときに、このコンストラクタが呼ばれる
        //this.name は「このクラスのフィールド」を指す。
        //受け取った引数 name をフィールドに代入している。
    }

    // 武器名を取得するメソッド
    public String getName() {
        return name;
        //外部から武器の名前や攻撃力を参照できるようにするメソッド。
        //直接フィールドにアクセスできないため、メソッドを通して値を取得する。
        
    }

    // 攻撃力を取得するメソッド
    public int getPower() {
        return power;
    }
}

//こうすることで、後で内部処理を変更しても、呼び出し側のコードに影響が少なくなる。


/*
覚えておくこと
フィールド
private にしてデータを保護（名前と攻撃力）
コンストラクタ
オブジェクト作成時に引数を使って初期化する
ゲッターメソッド
外部からフィールドの値を安全に取得する
 */