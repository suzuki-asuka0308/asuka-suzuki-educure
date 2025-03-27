// 負のスコア（マイナス値）の例外クラス
public class InvalidScoreException extends GameScoreException {

    // コンストラクタ：スコアを受け取ってメッセージ付きで親に渡す
    public InvalidScoreException(int score) {
        // 親クラスのコンストラクタにエラーメッセージとスコアを渡す
        super("Score cannot be negative", score);
    }
}