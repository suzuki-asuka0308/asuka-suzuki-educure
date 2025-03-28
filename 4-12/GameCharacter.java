// 必要なライブラリをインポート（ArrayList と並び替え用の Collections）
import java.util.ArrayList;
import java.util.Collections;

// ゲームのキャラクターを表すクラス
public class GameCharacter {

    // キャラクターの名前（例：勇者A）
    private String name;

    // キャラクターが持っている装備のリスト（複数の装備を持てるように ArrayList で管理）
    private ArrayList<Equipment> equipments;

    // コンストラクタ：キャラクター名を受け取って初期化し、装備リストは空でスタート
    public GameCharacter(String name) {
        this.name = name;
        this.equipments = new ArrayList<>(); // 最初は空のリストを作る
    }

    // 装備品をリストに追加するメソッド
    public void addEquipment(Equipment item) {
        equipments.add(item); // 渡された装備をリストに追加
    }

    // キャラクターが持っている装備を番号付きで表示するメソッド
    public void showEquipments() {
        System.out.println(name + "の装備："); // キャラ名 + 装備一覧

        // リストの中身を1つずつ取り出して表示
        for (int i = 0; i < equipments.size(); i++) {
            System.out.println((i + 1) + ". " + equipments.get(i));
            // ① 伝説の剣（攻撃力：100 防御力：0） ← toString() が自動で呼ばれる
        }
    }

    // 装備を強さ順（総合力の高い順）に並び替えるメソッド
    public void sortEquipments() {
        Collections.sort(equipments); // Equipmentクラスの compareTo() を使って並び替え
    }

    // テストなどで外から装備リストを見たいときに使う（getterメソッド）
    public ArrayList<Equipment> getEquipments() {
        return equipments; // 装備のリストを返す
    }
}