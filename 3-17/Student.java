public class Student {
    // 【要件1】名前と点数をprivateフィールドとして定義
    private String name;
    private int score;

    // 【要件2】名前のsetter（バリデーションあり）
    public void setName(String name) {
        if (name != null && name.length() >= 1 && name.length() <= 20) {
            //もし名前が空じゃなくて、1文字以上20文字以下なら、その名前を保存します
            this.name = name;
        } else {
            System.out.println("エラー：名前は1-20文字で設定してください");
        }
    }

    // 【要件3】点数のsetter（バリデーションあり）
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            //もし点数が0以上100以下なら
            this.score = score;
        } else {
            System.out.println("エラー：点数は0-100の範囲で設定してください");
        }
    }

    // 【要件2】名前のgetter
    public String getName() {
        return name;
    }

    // 【要件2】点数のgetter
    public int getScore() {
        return score;
    }
}
