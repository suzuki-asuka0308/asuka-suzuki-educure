// ゲームの得点に関する例外の親クラス（abstractなので直接は使わない）
public abstract class GameScoreException extends Exception {

    // スコアを保存するための変数
    private int score;

    // コンストラクタ（メッセージとスコアを受け取って初期化）
    public GameScoreException(String message, int score) {
        // 親クラス（Exception）にメッセージを渡す
        super(message);

        // スコアも自分で保存しておく
        this.score = score;
    }

    // スコアを取得するためのメソッド（呼び出し元で使う）
    public int getScore() {
        return score;
    }
}