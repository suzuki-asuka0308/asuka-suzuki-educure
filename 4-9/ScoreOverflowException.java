// 100点を超えたときに使う例外クラス
public class ScoreOverflowException extends GameScoreException {

    // コンストラクタ：スコアを受け取って、親クラスにエラーメッセージと一緒に渡す
    public ScoreOverflowException(int score) {
        super("Score cannot exceed 100", score);
    }
}