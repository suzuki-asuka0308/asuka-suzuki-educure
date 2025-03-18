public class Book {
    private String title;  // タイトル
    private String author; // 著者
    private int pages;     // ページ数

    // 【コンストラクタ1】タイトルと著者のみを受け取る（ページ数は0）
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0; // ページ数を0で初期化
        //タイトルと著者だけを指定し、ページ数は 0 にする
        //ポイント：コンストラクタは new したときに実行される！
        //new Book("Java入門", "山田太郎"); でページ数を省略できる！

    }

    // 【コンストラクタ2】タイトル、著者、ページ数を受け取る
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        //すべての情報（タイトル・著者・ページ数）を指定する
        //ポイント：オーバーロードを使うことで、new の方法を変えられる！
        //new Book("Python実践", "鈴木次郎", 300); でページ数も指定できる！
        //オーバーロードを使うと、異なるパターンの初期化ができる！

    }

    // 本の情報を表示するメソッド
    public void displayInfo() {
        System.out.println("本：" + title + " - " + author + "（" + pages + "ページ）");
        //本の情報を出力するメソッド
        //ポイント：「displayInfo() を呼べば、データを表示できる！」
        //book.displayInfo(); を実行すると、タイトル・著者・ページ数が表示される！
        //クラスのデータを表示するメソッドを作ることで、何度でも簡単にデータを確認できる！
    }

}

/*本を管理するクラスで、オーバーロードを使って2種類の初期化ができる！」と覚えればOK */
/*コンストラクタが new のときに動く」ことを理解するのが大事 */
