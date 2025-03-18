public class Weapon {
    // 武器の名前
    private String name;
    // 武器の攻撃力
    private int power;

    // コンストラクタ（武器の名前と攻撃力を設定）
    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
        //Weapon クラスのインスタンス（オブジェクト）を作るときに最初に実行されるメソッド
        //new Weapon("魔法の剣", 50); みたいに呼び出される
        //this.name = name; → クラスの name に、引数の name を代入する
        //this.power = power; → クラスの power に、引数の power を代入する
        //要件、name（String型）、power（int型）のフィールドを持たせる
    }

    // 武器の名前を取得するメソッド
    public String getName() {
        return name;
        /*public String getName() → 武器の名前を取得するメソッド
        return name; → name の値を呼び出し元に返す */
        /*要件 武器の名前を取得できるようにする」
        要件を満たしている！（getName() で取得できる）*/

    }

    // 武器の攻撃力を取得するメソッド（今回は使わないが、拡張用）
    public int getPower() {
        return power;
        /*public int getPower() → 武器の攻撃力を取得するメソッド
        return power; → power の値を呼び出し元に返す */
        /*攻撃力を取得できるようにする」
       要件を満たしている！（getPower() で取得できる） */
    }
}


/*シナリオ：オンラインゲームのキャラクター装備システムを作成する
�目的：クラス型のフィールドの理解
�要件：
�Weapon クラスを作成し、
name
（String型） * power
（int型）フィールドを持たせ
GameCharacter クラスを作成し、
name
（String型）、
hp
（int型）
weapon
（Weapon型）フィールドを持たせる
�mainメソッドでキャラクターを作成し、武器を装備させて、キャラクターの装備している武器の名前を表示する
�作成するクラス：Weaponクラス，GameCharacterクラス， Main1クラス
�ソースファイル名：Weapon.java, GameCharacter.java, Main1.java
�期待される出力：剣士アレックスは魔法の剣を装備しています*/