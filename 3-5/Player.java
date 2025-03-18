public class Player {
    private String name; // プレイヤーの名前
    private int hp;      // プレイヤーのHP（体力）

    // コンストラクタ（プレイヤーの名前と初期HPを設定）
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // HPを回復するメソッド
    public void heal(int amount) {
        this.hp += amount;  // HPを指定された値（amount）回復
        //this.hp += amount; は、プレイヤーのHPを回復する処理 です。
    }

    // プレイヤーの情報を表示するメソッド
    public void displayInfo() {
        System.out.println("プレイヤー名：" + name);
        System.out.println("プレイヤーのHP:" + hp);
        
    }

    // HPを取得するメソッド（回復ポーションで使用）
    public int getHp() {
        return hp;
    }
}