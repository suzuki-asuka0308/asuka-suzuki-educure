import java.util.ArrayList;
import java.util.Collections;

// キャラクタークラス：名前と装備のリストを持つ
public class GameCharacter {
    private String name;
    private ArrayList<Equipment> equipments;

    // コンストラクタ：キャラクター名を設定し、装備リストを初期化
    public GameCharacter(String name) {
        this.name = name;
        this.equipments = new ArrayList<>();
    }

    // 装備を追加するメソッド
    public void addEquipment(Equipment item) {
        equipments.add(item);
    }

    // 装備を番号付きで表示するメソッド
    public void showEquipments() {
        System.out.println(name + "の装備:");
        for (int i = 0; i < equipments.size(); i++) {
            System.out.println((i + 1) + ". " + equipments.get(i));
        }
    }

    // 装備を強さ順に並べ替えるメソッド
    public void sortEquipments() {
        Collections.sort(equipments); // compareToを使って並び替え
    }

    // 外部から装備リストを取得するメソッド（テスト用）
    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }
}