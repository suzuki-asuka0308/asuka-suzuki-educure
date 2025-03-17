public class Main3 {
    public static void main(String[] args) {
        // 口座のインスタンスを生成し、初期残高を表示
        BankAccount account = new BankAccount();
        /*BankAccount → BankAccount クラスを元に新しいオブジェクトを作成
	    account → 作成した口座を操作するための変数
	    new BankAccount(); → コンストラクタを実行（口座の作成） */
        //要件、口座のインスタンスを生成し、初期残高を表示

        // 10000円を預ける
        account.deposit(10000);
        /*account → さっき作った口座
	    .deposit(10000) → 10000円を口座に入れる（deposit メソッド実行） */
        /*balance += 10000; → 残高が 0円 → 10000円 に増える
	    "10000円預けました" を表示
	    "残高：10000円" を表示 */
        //要件、10000円を預ける


        // 3000円を引き出す
        account.withdraw(3000);
        /*account → 口座
	    .withdraw(3000) → 3000円を引き出す（withdraw メソッド実行） */
        /*現在の残高は 10000円
	    if (3000 > 10000) → 条件が false なので else に進む
	    balance -= 3000; → 残高が 10000円 → 7000円 に減る
	    "3000円引き出しました" を表示
	    "残高：7000円" を表示 */
        //要件、3000円を引き出す

        // 残高不足となる8000円の引き出しを試みる
        account.withdraw(8000);
        //withdraw(8000) → 8000円を引き出そうとする
        /*現在の残高は 7000円
	    if (8000 > 7000) → 条件が true なので "残高が不足しています" を表示 */
        //残高不足となる8000円の引き出しを試みる
    }
}