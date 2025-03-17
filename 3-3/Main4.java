public class Main4 {
    public static void main(String[] args) {
        // 武器のインスタンスを作成し、名前と攻撃力を設定
        Weapon weapon = new Weapon();
        weapon.setWeapon("伝説の剣", 100);
        //ここでは Weapon クラスのオブジェクトを作成し、武器の名前と攻撃力を設定しています。
        // 武器を10回使用して耐久度を0にする
        for (int i = 0; i < 10; i++) {
            weapon.use();
           /* durability > 0 の間は durability-- して耐久度を減らす
	     10回使うと durability == 0 になる */
        }

        // 耐久度が0の状態で使用を試みる
        weapon.use();
        /*すでに耐久度が0の状態で use() を呼び出すと、
        「武器が劣化している」というメッセージが出ます。 */

        // 武器を修理する
        weapon.repair();
        //repair() メソッドを実行して、耐久度を最大に戻します。
    

        // 修理後に再度使用する
        weapon.use();
        //repair() の後に use() を呼ぶので、通常通り武器が使えます。
    }
}