public class Library { // Library（図書館）というクラスを定義する

    // 【要件5】lendBook：本を貸し出す処理をするメソッド
    public void lendBook(Book book) {
        // もしこの本が貸し出されていないなら（未貸出なら）
        if (!book.isLent()) {
            // 本の貸出状態を true（貸出中）に変更する
            book.setLent(true);

            // 「○○を貸し出しました」と画面に表示する
            System.out.println("「" + book.getTitle() + "」を貸し出しました");
        } else {
            // すでに貸し出されている本だったら、エラーメッセージを表示する
            System.out.println("エラー：この本は既に貸し出し中です");
        }
    }

    // 【要件6】returnBook：本を返却する処理をするメソッド
    public void returnBook(Book book) {
        // もしこの本が貸し出されていたら
        if (book.isLent()) {
            // 本の貸出状態を false（未貸出）に変更する
            book.setLent(false);

            // 「○○が返却されました」と画面に表示する
            System.out.println("「" + book.getTitle() + "」が返却されました");
        } else {
            // まだ貸し出されていない本を返そうとしたら、エラーメッセージを表示する
            System.out.println("エラー：この本は未貸出のため返却できません");
        }
    }
}