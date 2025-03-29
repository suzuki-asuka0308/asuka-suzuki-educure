public class Main5 {
    public static void main(String[] args) {
        // 勇者Aというキャラクターを作成
        GameCharacter hero = new GameCharacter("勇者A");

        // 装備品を作成（攻撃力・防御力を指定）
        Equipment sword = new Equipment("伝説の剣", 100, 0);
        Equipment shield = new Equipment("光の盾", 0, 80);
        Equipment boots = new Equipment("魔法の靴", 10, 20);

        // 装備をキャラクターに追加
        hero.addEquipment(sword);
        hero.addEquipment(shield);
        hero.addEquipment(boots);

        // --- キャラクターの装備情報を表示 ---
        System.out.println("--- キャラクター装備情報 ---");
        hero.showEquipments();

        // --- 複製テスト ---
        Equipment copied = sword.clone(); // クローン作成
        boolean cloneTest = copied.equals(sword); // 同じ内容か確認
        System.out.println("装備の複製テスト：" + (cloneTest ? "OK" : "NG"));

        // --- 比較テスト（sword > shield）ならOK ---
        boolean compareTest = sword.compareTo(shield) < 0;
        System.out.println("装備の比較テスト：" + (compareTest ? "OK" : "NG"));

        // --- ソートテスト（強い順） ---
        hero.sortEquipments(); // 装備を強い順に並び替え

        // 並び替えたあと、先頭がsword（伝説の剣）ならOK
        boolean sortTest = hero.getEquipments().get(0).equals(sword);
        System.out.println("装備の強さソート：" + (sortTest ? "OK" : "NG"));
    }
}