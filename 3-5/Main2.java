public class Main2 {
    public static void main(String[] args) {
        // プレイヤーを作成（名前：勇者、初期HP：30）
        Player hero = new Player("勇者", 30);

        // プレイヤーの情報を表示
        hero.displayInfo();

        // 回復ポーションの作成
        HealingPotion potion = new HealingPotion();

        // 回復ポーションを使用
        potion.heal(hero);

        // 回復後のプレイヤー情報を表示
        hero.displayInfo();
    }
}