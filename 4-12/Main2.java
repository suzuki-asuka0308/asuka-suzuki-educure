public class Main2 {  // Main2クラス：ここからプログラムが実行される
    public static void main(String[] args) {  // Javaの「メインメソッド」。プログラムのスタート地点。

        // Monsterクラスのインスタンス（モンスター）を3体作る

        // monster1を作成：名前「スライム」、レベル5
        Monster monster1 = new Monster("スライム", 5);

        // monster2を作成：名前「スライム」、レベル5（monster1と同じ内容）
        Monster monster2 = new Monster("スライム", 5);

        // monster3を作成：名前「スライム」、レベル10（monster1とはレベルが違う）
        Monster monster3 = new Monster("スライム", 10);

        // monster1とmonster2を比較する
        if (monster1.equals(monster2)) {
            // equalsメソッドの結果がtrueなら、同じモンスターとみなす
            System.out.println("スライムLv.5 と スライムLv.5 は同じモンスターです");
        } else {
            // equalsメソッドの結果がfalseなら、違うモンスター
            System.out.println("スライムLv.5 と スライムLv.5 は違うモンスターです");
        }

        // monster1とmonster3を比較する
        if (monster1.equals(monster3)) {
            // レベルが違うので、equalsの結果はfalseになるはず
            System.out.println("スライムLv.5 と スライムLv.10 は同じモンスターです");
        } else {
            // 違うモンスターとみなされる
            System.out.println("スライムLv.5 と スライムLv.10 は違うモンスターです");
        }
    }
}