public class Main2 {
    public static void main(String[] args) {
        // 本のインスタンスを作成（Java入門）
        Book book1 = new Book("Java入門", 2500, "山田太郎", 3);
        //new Book(...) を使って Book クラスのオブジェクト（インスタンス）を作る
        //コンストラクタの引数（"Java入門", 2500, "山田太郎", 3）が Book クラスに渡される

        // 本の情報を表示
        book1.displayInfo();
        //Book は Product を継承しているので、name や price をそのまま使える！
        //オーバーライドされた displayInfo() を呼び出して、本の情報を表示！

        // 在庫チェック
        book1.checkStock();
        //Book クラスの checkStock() が実行される
        //stockQuantity（在庫数）が 1 以上なら「在庫あり」、0 なら「在庫なし」と表示される
        //この場合、stockQuantity = 3 なので、「在庫あり」と表示される！
        //checkStock() を呼び出すと、在庫の有無を判定する！」
    }
}