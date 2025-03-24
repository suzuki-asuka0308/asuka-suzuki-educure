public class Main4 { // Main4というクラス（プログラムのスタート地点になるクラス）
    public static void main(String[] args) { // Javaのプログラムはここから実行される

        // 【要件7】Bookクラスを使って「Java入門」という本のオブジェクトを作る
        Book book = new Book("Java入門");

        // Libraryクラスを使って「図書館の管理者（操作する人）」のオブジェクトを作る
        Library library = new Library();

        // 1回目の貸し出し（未貸出の本なので、貸し出し成功）
        library.lendBook(book);

        // 2回目の貸し出し（すでに貸し出されている本なので、エラーメッセージが出る）
        library.lendBook(book);

        // 本を返却する（貸し出し状態から未貸出に戻す）
        library.returnBook(book);

        // 返却された本をもう一度貸し出す（今は未貸出なので、貸し出し成功）
        library.lendBook(book);
    }
}