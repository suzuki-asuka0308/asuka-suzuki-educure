// Library クラス：図書館の貸出可能な本の総数を管理するクラス（要件：Libraryクラスを作成）
public class Library {

    // 【要件：static int availableBooks（貸出可能な本の総数）を管理】
    // static（静的）なフィールド：全体で共有される貸出可能な本の総数
    // 【要件：availableBooksの初期値は100とする】
    private static int availableBooks = 100;

    // 【要件：borrowBook() で本を借りる（availableBooksをデクリメント）】
    public static void borrowBook() {
        // 貸出可能な本が1冊以上あるかを確認
        if (availableBooks > 0) {
            // 本を1冊貸し出す（冊数を1減らす）
            availableBooks--;
            System.out.println("1冊借りました");
        } else {
            // 【要件：貸出可能な本の総数が0以下の状態で借りようとした場合、エラーメッセージを表示】
            System.out.println("エラー：貸出可能な本がありません");
        }
    }

    // 【要件：returnBook() で本を返却（availableBooksをインクリメント）】
    public static void returnBook() {
        // 本を1冊返却して、貸出可能な本の冊数を1増やす
        availableBooks++;
        System.out.println("本を返却しました");
    }

    // 【要件：static int getAvailableBooks() で残りの本の冊数を取得】
    public static int getAvailableBooks() {
        // staticなのでインスタンスを作らずに呼び出せる
        return availableBooks;
    }
}