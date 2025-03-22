public class RegularEmployee extends Employee {
    private int baseSalary;
    //正社員の「基本給」を保存するためのフィールド。
    //private にして、外から直接アクセスできないようにしている（カプセル化の考え方）

    public RegularEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
        //このコンストラクタは、RegularEmployee オブジェクトを作るときに呼ばれる。
        //super(name)：親クラスの Employee(String name) を呼び出して name を初期化！
        //this.baseSalary：渡された基本給をこのクラスの変数にセット
    }

    @Override
    public String getRole() {
        return "正社員";
        //親クラスで定義されていた getRole() をオーバーライド。
        //この子クラスでは「正社員」として返すようにしてる。
    }

    @Override
    public int calculateSalary() {
        return baseSalary;
        //親クラスの calculateSalary()（抽象メソッド）をオーバーライド。
        //基本給をそのまま返すだけのシンプルな実装。
    }
}
