public class Main5 {
    public static void main(String[] args) {

        // 勇者Aというキャラクターを作成
        GameCharacter hero = new GameCharacter("勇者A");

        // 3つの装備品を作成
        Equipment sword = new Equipment("伝説の剣", 100, 0);
        Equipment shield = new Equipment("光の盾", 0, 80);
        Equipment boots = new Equipment("魔法の靴", 10, 20);

        // キャラクターに装備を追加していく
        hero.addEquipment(sword);
        hero.addEquipment(shield);
        hero.addEquipment(boots);

        // --- キャラクターの装備を表示 ---
        System.out.println("--- キャラクター装備情報 ---");
        hero.showEquipments(); // 番号付きで装備を表示

        // --- 複製（クローン）テスト ---
        Equipment copied = sword.clone(); // 伝説の剣をコピー
        boolean cloneTest = copied.equals(sword); // コピー元と同じかチェック
        System.out.println("装備の複製テスト：" + (cloneTest ? "OK" : "NG"));

        // --- 比較テスト ---
        // 伝説の剣が光の盾より強いか（compareToで比較）
        boolean compareTest = sword.compareTo(shield) < 0 == false;
        System.out.println("装備の比較テスト：" + (compareTest ? "OK" : "NG"));

        // --- ソートテスト ---
        // 装備を強さ順に並べ替え
        hero.sortEquipments();

        // ソート結果の1番目が伝説の剣なら OK
        boolean sortTest = hero.getEquipments().get(0).equals(sword);
        System.out.println("装備の強さソート：" + (sortTest ? "OK" : "NG"));
    }
}