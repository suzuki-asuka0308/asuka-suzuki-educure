public class Main4 {
    public static void main(String[] args) {
        // 元のキャラクターを作成
        PartyMember original = new PartyMember("アリス");
        original.addSkill("ファイア");
        original.addSkill("ブリザード");

        // クローン（コピー）を作成
        PartyMember clone = original.clone();
        clone.addSkill("サンダー");  // コピーにだけ新しいスキルを追加

        // 表示
        System.out.println("--- 深いコピー後にスキル追加 ---");
        original.showSkills(); // 元のキャラ（アリス）
        clone.showSkills();    // コピーしたアリス
    }
}