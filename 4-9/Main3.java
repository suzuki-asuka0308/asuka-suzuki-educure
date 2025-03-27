public class Main3 {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();
        
        // 正常値のテスト
        System.out.println("得点: 50");
        try {
            manager.validateScore(50);
            System.out.println("OK");
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
        
        // 負の値のテスト
        System.out.println("\n得点: -10");
        try {
            manager.validateScore(-10);
            System.out.println("OK");
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
        
        // 超過値のテスト
        System.out.println("\n得点: 150");
        try {
            manager.validateScore(150);
            System.out.println("OK");
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
    }
}

/*キーワード
超かんたんに言うと…
throw
自分でエラー（例外）を「投げる」こと
throws
「このメソッドはエラーを投げる可能性あるよ」と宣言すること
extends
「別のクラスを引き継いでるよ」っていう意味（親子関係）
Exception
Javaでエラーを表す特別な型
try-catch
エラーが起きそうな処理を囲って、失敗しても止まらないようにする
 */