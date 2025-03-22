public abstract class Employee {
    //abstract をつけることで「抽象クラス（＝設計図）」になる。
    //直接 new Employee() はできない。
    //継承して使うことが前提のクラス
    protected String name;
    //社員の名前を保存する変数
    //protected は 自分自身と子クラスからは使えるアクセス修飾子。
    //	子クラス（正社員やパート）で this.name って書けるようになる。

    public Employee(String name) {
        this.name = name;
        //コンストラクタ。new RegularEmployee("山田", ...) のときに呼ばれる。
        //子クラスが super(name) と書くことで、ここが呼び出されて name をセットできる。
    }

    public String getName() {
        return name;
        //社員の名前を外から取得できるようにするメソッド。
        /*名前は private や protected で直接取れないことがあるから、
        このメソッド経由で取得させるのが基本的な設計の考え方！ */
    }

    public abstract String getRole(); // 役職名（例：正社員、パートタイム）
    //抽象メソッド。中身がない → 子クラスで必ず実装しなきゃいけない！
    //役職名（例：正社員、パートタイム）を返す」というルールをここで決めてる。

    public abstract int calculateSalary(); // 給与を計算する（抽象メソッド）
    //こちらも抽象メソッド
    //給与をどう計算するか」は、正社員とパートで違うので、それぞれ子クラスで定義する。
}