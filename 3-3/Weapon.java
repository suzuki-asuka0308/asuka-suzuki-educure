public class Weapon {
    public int attack;
    public int durability;
    public final int MAX_DURABILITY = 10;
    public boolean isRepaired = false; // 修理後の最初の使用時フラグ
    /*public → 他のクラス（例えば Main4）から直接アクセスできる
	•	int attack; → 攻撃力を格納する変数 */
    /*耐久度（武器の使用回数）を表す数値
	•	int durability; → 耐久度を格納する変数 */
    /*final → 値を変更できない（定数）
	MAX_DURABILITY = 10; → 武器の最大耐久度は 10 */
    //要件attack（攻撃力）のフィールドを持たせる」
    //要件durability（耐久度）のフィールドを持たせる


    // 武器の名前と攻撃力を設定
    public void setWeapon(String name, int attack) {
        this.attack = attack;
        this.durability = MAX_DURABILITY;
        System.out.println(name + "を作成しました（攻撃力：" + attack + "）");
    /*this.attack = attack; → 指定した攻撃力を設定
	•	this.durability = MAX_DURABILITY; → 耐久度を最大値（10）にリセット */
    /*要件、setWeapon メソッドで武器の名前と攻撃力を設定し、初期耐久度を最大値に設定する */
    }

    // 武器を使用するメソッド
    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println("武器を使用しました！残り耐久度：" + durability);
            System.out.println("攻撃力：" + attack + " / 耐久度：" + durability);
        } else {
            System.out.println("武器は完全に劣化しています。修理が必要です！");
        }
        /*if (durability > 0) → 耐久度がある場合
		durability--; → 耐久度を 1 減らす
		耐久度を表示
		耐久度が 0 以下の場合
		「武器は完全に劣化しています。修理が必要です！」と表示 */
        //要件、use() メソッドで武器を使用し、武器を使用する度に耐久度を 1 減少させる」
        //耐久度が 0 以下になった状態で使用を試みた場合、使用不可のメッセージを表示
    }

    // 武器を修理するメソッド
    public void repair() {
        durability = MAX_DURABILITY;
        isRepaired = true;
        System.out.println("武器を修理しました！耐久度が最大になりました");
        System.out.println("攻撃力：" + attack + " / 耐久度：" + durability);
        /*耐久度を最大値（10）に回復
		isRepaired = true; → 修理フラグを立てる
		修理完了のメッセージを表示 */
        //要件、repair() メソッドで耐久度を最大値に回復し、修理フラグを立てる
    }

    // 攻撃力を取得するメソッド
    public int getAttack() {
        return attack;
        //要件、攻撃力の getter メソッドを実装する（getAttack）
    }

    // 耐久度を取得するメソッド
    public int getDurability() {
        return durability;
        //要件、耐久度の getter メソッドを実装する（getDurability）
    }
}
