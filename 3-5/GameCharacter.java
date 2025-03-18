public class GameCharacter {
    // キャラクターの名前
    private String name;
    // キャラクターのHP
    private int hp;
    // キャラクターの装備している武器（Weapon型）
    private Weapon weapon;

    // コンストラクタ（名前とHPを設定）
    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    // 武器を装備するメソッド
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // キャラクターの情報を表示するメソッド
    public void showEquipment() {
        if (weapon != null) {
            System.out.println(name + "は" + weapon.getName() + "を装備しています");
        } else {
            System.out.println(name + "はまだ武器を装備していません");
        }
        /*weapon != null の場合（武器を持っている）
        武器の名前を取得して表示する
		weapon == null の場合（武器を持っていない）
        「まだ武器を装備していません」と表示する */
        /*Java では、クラスのフィールド（メンバ変数）は 初期値として null を持つ ので、
       キャラクターが equipWeapon() を使って武器を装備しない限り、weapon は null のままです。 */
    }
}