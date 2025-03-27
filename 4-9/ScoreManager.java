// スコアのチェックを行うクラス
public class ScoreManager {

    // スコアを確認するメソッド
    public void validateScore(int score) throws GameScoreException {

        // ① スコアが負の値だったらエラーを投げる
        if (score < 0) {
            throw new InvalidScoreException(score);
        }

        // ② スコアが100を超えていたらエラーを投げる
        if (score > 100) {
            throw new ScoreOverflowException(score);
        }

        // ③ 正常なスコアなら「OK」と表示
        System.out.println("OK");
    }
}