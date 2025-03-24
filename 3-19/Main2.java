// Main2 クラス：プログラムの実行が始まるクラス
public class Main2 {
    // mainメソッド：Javaアプリケーションのスタート地点
    public static void main(String[] args) {

        // 学籍番号1、名前「田中」の Student オブジェクトを作成して、変数 s1 に代入
        Student s1 = new Student(1, "田中");

        // 同じ学籍番号1、名前「たなか」の Student オブジェクトを作成して、s2 に代入
        // 名前は違うけど、学籍番号が同じなので同一人物と見なされるかを検証する
        Student s2 = new Student(1, "たなか");

        // 学籍番号2、名前「佐藤」の Student オブジェクトを作成して、s3 に代入
        // s1 とは学籍番号が違うので、違う人物とみなされるはず
        Student s3 = new Student(2, "佐藤");

        // s1 と s2 を比較：equals() メソッドが呼び出される
        // 同じ学籍番号なので「同一の学生です」と表示されることを期待
        if (s1.equals(s2)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }

        // s1 と s3 を比較：equals() メソッドで学籍番号が違うと判断される
        // なので「違う学生です」と表示されるはず
        if (s1.equals(s3)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }
    }
}