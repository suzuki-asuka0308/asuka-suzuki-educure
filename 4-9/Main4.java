public class Main4 {
    public static void main(String[] args) {
        // StudentManagerのインスタンスを作成
        StudentManager manager = new StudentManager();

        // 学生を5人追加
        manager.addStudent("アリス");
        manager.addStudent("ボブ");
        manager.addStudent("チャーリー");
        manager.addStudent(null); // データなしのID（3）
        manager.addStudent("イヴ");

        // 6人目を追加しようとしてエラーを表示
        manager.addStudent("グレース");

        // 学生ID 2を取得（チャーリー）
        System.out.println("学生ID 2：" + manager.getStudent(2));

        // ID 3 はnullなので、エラーメッセージ＋null出力
        System.out.println("学生ID 3：" + manager.getStudent(3));

        // 存在しないID 10 を取得しようとしてエラー
        System.out.println("学生ID 10：" + manager.getStudent(10));

        // 学生ID 0 と 1 のデータを更新
        manager.updateStudent(0, "フランク");
        manager.updateStudent(1, "ボビー");

        // 更新後の学生ID 1 の情報を表示
        System.out.println("更新後の学生ID 1：" + manager.getStudent(1));

        // 存在しないID 10 を更新しようとしてエラー
        manager.updateStudent(10, "ゾーイ");
    }
}