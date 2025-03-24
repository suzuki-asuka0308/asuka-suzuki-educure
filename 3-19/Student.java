// java.utilパッケージから Objects クラスを読み込む
// → hashCodeの計算に使用されるユーティリティクラス
import java.util.Objects;

// Studentクラスを定義（学生を表すクラス）
public class Student {
    // 学籍番号（ID）を表すフィールド。外からは直接アクセスできないよう private にしている
    private int id;

    // 氏名（名前）を表すフィールド。こちらも private
    private String name;

    // コンストラクタ：新しい Student を作るときに、学籍番号と名前を初期化する
    public Student(int id, String name) {
        this.id = id;       // 引数のidを、このクラスのidフィールドに代入
        this.name = name;   // 引数のnameを、このクラスのnameフィールドに代入
    }

    // equals()メソッドをオーバーライド（上書き）
    // → 2人の学生が「同じ人物かどうか」を判定する独自ルールを定義
    @Override
    public boolean equals(Object obj) {
        // 自分自身と比較している場合（同じオブジェクト）なら true を返す
        if (this == obj) {
            return true;
        }

        // 比較対象が null または クラスが違う場合（例えば Teacher など）、false を返す
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Object型を Student型にキャストして、学籍番号を比較
        Student student = (Student) obj;

        // 学籍番号が同じなら「同一の学生」とみなす
        return id == student.id;
    }

    // hashCode()メソッドもオーバーライド
    // → equals()をオーバーライドしたときは、hashCode()もセットでオーバーライドするのがルール
    //   同じidの学生は、同じハッシュ値になるようにする
    @Override
    public int hashCode() {
        return Objects.hash(id); // idを元にハッシュ値を生成
    }

    // オブジェクトを文字列として表示するときの形式を指定
    // 例：System.out.println(student) をしたときに呼ばれる
    @Override
    public String toString() {
        return "ID: " + id + ", 名前: " + name;
    }
}

/*Javaでは、オブジェクト同士が同じかどうかを自分のルールで決めたかったら 
equals() をオーバーライド */

/*優先度
覚え方のポイント
理由
◎
toString()：表示される文字変えたいとき
使う場面が超多い
◎
equals()：中身の比較をしたいとき
ロジックで必須になる
○
getClass()：equalsの中で使う
正確な比較したいとき
△
hashCode()：equalsとセットで書く
MapやSet使うとき用
 */