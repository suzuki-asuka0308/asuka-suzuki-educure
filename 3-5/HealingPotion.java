public class HealingPotion {
    // healメソッド（Playerを回復する）
    public void heal(Player player) {
        System.out.println("回復ポーションを使用しました");
        player.heal(50);  // プレイヤーのHPを50回復
    }
}