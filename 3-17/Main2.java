public class Main2 {
    public static void main(String[] args) {
        // 【要件4】Studentインスタンスの作成と正しい値の設定
        Student student = new Student();
        student.setName("田中太郎");
        student.setScore(85);

        // 【要件4】学生情報を表示
        System.out.println(student.getName() + "さんの点数：" + student.getScore() + "点");

        // 【要件5】不正な点数を設定（-5など）
        student.setScore(-5);

        // 【要件5】不正な名前を設定（空文字など）
        student.setName("");
    }
}