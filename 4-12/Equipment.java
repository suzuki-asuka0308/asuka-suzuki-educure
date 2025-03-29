// 装備品クラス：装備の名前・攻撃力・防御力を持つ
public class Equipment implements Comparable<Equipment>, Cloneable {
    private String name;
    private int attack;
    private int defense;

    // コンストラクタ：装備の名前、攻撃力、防御力を初期化
    public Equipment(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    // 総合力（攻撃力 + 防御力）を返す
    public int getPower() {
        return attack + defense;
    }

    // 装備品の複製（deep copy）
    @Override
    public Equipment clone() {
        return new Equipment(this.name, this.attack, this.defense);
    }

    // 内容が同じ装備かどうかを判定
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Equipment)) return false;

        Equipment other = (Equipment) obj;
        return this.name.equals(other.name) &&
               this.attack == other.attack &&
               this.defense == other.defense;
    }

    // 総合力で比較（降順）→ 強い装備が先に来るように
    @Override
    public int compareTo(Equipment other) {
        return other.getPower() - this.getPower();
    }

    // 装備の情報を見やすく文字列にする
    @Override
    public String toString() {
        return name + " (攻撃力:" + attack + " 防御力:" + defense + ")";
    }
}