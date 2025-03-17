public class Main2 {
    public static void main(String[] args) {
        // 本のインスタンスを生成し、タイトルを「Java入門」に設定
        Book book = new Book("Java入門");
    /*new Book("Java入門") → Book クラスの インスタンス（実体） を作る
	•	"Java入門" → 本のタイトル を設定
	•	book → Book クラスの インスタンスを参照する変数 */
    /*このコードが実行されると…
	1.	Book クラスの コンストラクタ（Book(String title)） が呼ばれる
	2.	title に "Java入門" がセットされる
	3.	isLent が false（貸し出し中でない） に設定される
	4.	「“Java入門”を登録しました」 が表示される */
    //要件、本のインスタンスを生成し、タイトルを『Java入門』に設定

        // 本を2回連続で貸し出そうとする
        book.lend();
        book.lend();
    /*	1.	lend() メソッドが呼ばれる
	2.	isLent == false なので、本を貸し出せる
	3.	isLent = true（貸し出し中に変更）
	4.	「本を貸し出しました」 が表示される
    2回目の book.lend(); の実行
	1.	lend() メソッドが呼ばれる
	2.	すでに isLent == true（貸出中） なので貸し出せない
	3.	「申し訳ありません。この本は貸出中です」 が表示される */
    /*要件、本を2回連続で貸し出そうとする」 に対応。
→ 「lend()メソッドで本を貸し出す（既に貸出中の場合はメッセージを表示） */

        // 本を返却する
        book.returnBook();
    /*1.returnBook() メソッドが呼ばれる
	2.	isLent == true（貸出中）なので、返却可能
	3.	isLent = false（貸出状態を解除）
	4.	「本が返却されました」 が表示される */
    /*要件、本を返却する」 に対応。
→ 「returnBook()メソッドで本を返却する（貸出中の場合のみ返却処理を実行）」 に対応。 */

        // 再度本を貸し出す
        book.lend();
    /*1.	lend() メソッドが呼ばれる
	2.	isLent == false（貸出可能な状態）
	3.	isLent = true（貸し出し中に変更）
	4.	「本を貸し出しました」 が表示される */
    // 「再度本を貸し出す」 に対応。
    }
}
