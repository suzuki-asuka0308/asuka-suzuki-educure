public class Main1 {
    public static void main(String[] args) {
        // キャラクター「剣士アレックス」を作成（HP100）
        GameCharacter alex = new GameCharacter("剣士アレックス", 100);

        // 武器「魔法の剣」を作成（攻撃力50）
        Weapon magicSword = new Weapon("魔法の剣", 50);

        // キャラクターに武器を装備させる
        alex.equipWeapon(magicSword);
       /* alex.equipWeapon(magicSword); は、キャラクターが武器を装備する ためのコードです。
      この行がないと、キャラクターは武器を持たず、攻撃もできません。*/

        // キャラクターの装備情報を表示
        alex.showEquipment();
    }
}