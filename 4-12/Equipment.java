// 装備品を表すクラス
public class Equipment implements Comparable<Equipment>, Cloneable {

    // 装備の名前（例：伝説の剣など）
    private String name;

    // 装備の攻撃力（数字）
    private int attack;

    // 装備の防御力（数字）
    private int defense;

    // コンストラクタ：装備の名前・攻撃力・防御力を受け取って初期化する
    public Equipment(String name, int attack, int defense) {
        this.name = name;         // フィールドに代入
        this.attack = attack;
        this.defense = defense;
    }

    // 総合力（攻撃力＋防御力）を返すメソッド
    public int getPower() {
        return attack + defense; // 総合力＝攻撃力 + 防御力
    }

    // cloneメソッドのオーバーライド（装備を複製する）
    @Override
    public Equipment clone() {
        // 新しいEquipmentインスタンスを作って、同じ値を渡している（深いコピー）
        return new Equipment(this.name, this.attack, this.defense);
    }

    // equalsメソッドのオーバーライド（同じ装備かどうかを判定する）
    @Override
    public boolean equals(Object obj) {
        // ① 同じオブジェクトなら true
        if (this == obj) return true;

        // ② nullや違う型なら false
        if (obj == null || !(obj instanceof Equipment)) return false;

        // ③ 値が同じかどうかを比較する
        Equipment other = (Equipment) obj;
        return this.name.equals(other.name) &&
               this.attack == other.attack &&
               this.defense == other.defense;
    }

    // compareToメソッド（総合力で大小を比べる）強い順（降順）になるように
    @Override
    public int compareTo(Equipment other) {
        return other.getPower() - this.getPower();
        // 自分より相手の方が強ければ正の値、逆なら負の値を返す
    }

    // toStringメソッドのオーバーライド（装備の情報を見やすく文字にする）
    @Override
    public String toString() {
        return name + "（攻撃力：" + attack + " 防御力：" + defense + "）";
        // 例：伝説の剣（攻撃力：100 防御力：0）
    }
}