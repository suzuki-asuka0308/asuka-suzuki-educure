public class StudentManager {
    // 最大5人の学生を保存できる配列
    private String[] students = new String[5];

    // 現在追加されている学生の人数をカウントする変数
    private int count = 0;

    // 学生を追加するメソッド
    public void addStudent(String name) {
        // すでに配列がいっぱいならエラーメッセージを表示
        if (count >= students.length) {
            System.out.println("エラー：これ以上学生を追加できません。リストがいっぱいです。");
            return;
        }

        // 配列に名前を追加して、カウントを1つ増やす
        students[count] = name;
        count++;
    }

    // 学生の名前を取得するメソッド（idを指定）
    public String getStudent(int id) {
        // id が配列の範囲外（小さすぎ or 大きすぎ）の場合
        if (id < 0 || id >= students.length) {
            System.out.println("エラー：無効な学生IDです：" + id);
            return null;
        }

        // 配列の中身が null（データがまだない）場合
        if (students[id] == null) {
            System.out.println("エラー：学生ID " + id + "にデータがありません。");
            return null;
        }

        // 正常な場合は、名前を返す
        return students[id];
    }

    // 学生の名前を更新するメソッド
    public void updateStudent(int id, String name) {
        // IDが配列の範囲外の場合
        if (id < 0 || id >= students.length) {
            System.out.println("エラー：無効な学生IDです：" + id);
            return;
        }

        // 配列の中身が null の場合（まだ登録されてないIDに更新しようとしてる）
        if (students[id] == null) {
            System.out.println("エラー：学生ID " + id + "にデータがありません。");
            return;
        }

        // 正常な場合は、名前を更新する
        students[id] = name;
    }
}