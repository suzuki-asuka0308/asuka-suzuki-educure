
public class Book {
    // 1. フィールド（インスタンス変数）
    private String title; // 本のタイトル
    private boolean isLent; // 貸出状態（true:貸出中, false:貸出可能）
    /*title（本のタイトル）→ 文字列（String型） で管理
	•	isLent（本が貸し出し中かどうか）→ 真偽値（boolean型） で管理
	•	trueなら貸出中、falseなら貸出されていない状態 */
    //Bookクラスを作成し、title（タイトル）とisLent（貸出中かどうか）のフィールドを持たせる

     // 2. コンストラクタ（オブジェクトを作るときに呼ばれる）
    public Book(String title) {
        this.title = title; // 本のタイトルを設定
        this.isLent = false; // 初めは貸出されていない状態にする
        System.out.println("「" + title + "」を登録しました");
        //Book クラスのコンストラクタ（初期設定）を定義
        //this.title = title; → 本のタイトルを設定
        //this.isLent = false; → 初期状態では貸し出されていない（false）
        //要件、本のインスタンスを生成し、タイトルを『Java入門』に設定

    }

    // 3. タイトルのgetter（取得）メソッド
    public String getTitle() {
        return title;
       //getTitle() → 現在のタイトルを取得して返すメソッド
       //要件、タイトルのgetterメソッドを実装する（getTitle）
    }

    // 4. タイトルのsetter（設定）メソッド（今回は使わない）
    public void setTitle(String title) {
        this.title = title;
        //setTitle(String title) → 新しいタイトルを設定するメソッド
        //要件タイトルのsetterメソッドを実装する（setTitle）

    }

    // 5. 貸出メソッド（本を借りる処理）
    public void lend() {
        if (isLent) {
            System.out.println("申し訳ありません。この本は貸出中です");
        } else {
            isLent = true; // 貸出中に変更
            System.out.println("本を貸し出しました");
        /*if (isLent) { ... } → すでに貸出中なら「貸出中です」と表示
	•	else { ... } → 貸し出せる場合はisLent = true;にして「貸し出しました」と表示 */
        //要件、lend()メソッドで本を貸し出す（既に貸出中の場合はメッセージを表示）
    
        }
    }

    // 6. 返却メソッド（本を返す処理）
    public void returnBook() {
        if (isLent) {
            isLent = false; // 貸出中の状態を解除
            System.out.println("本が返却されました");
        /*if (isLent) { ... } → 貸し出し中のときだけisLent = false;にして
        「本が返却されました」と表示 */
        //returnBook()メソッドで本を返却する（貸出中の場合のみ返却処理を実行）

        }
    }
}

/* シナリオ：図書館の本を管理するシステムを作成する。
 目的：フィールドとメソッドの使い方を理解する。
  要件：
  Bookクラスを作成し、title（タイトル）とisLent（貸出中かどうか）のフィールドを持たせる
 タイトルのgetter/setterメソッドを実装する（setTitle, getTitle）
  lend（）メソッドで本を貸し出す（既に貸出中の場合はメッセージを表示）
  returnBook（）メソッドで本を返却する（貸出中の場合のみ返却処理を実行）
  mainメソッドでは以下の処理を実装する：
 本のインスタンスを生成し、タイトルを「Java入門」に設定
 本を2回連続で貸し出そうとする
 本を返却する
 再度本を貸し出す
  作成するクラスとソースファイル名：
  Bookクラス：Book.java
  Main2クラス：Main2.java
 期待される出力：
「Java入門」を登録しました
本を貸し出しました
申し訳ありません。この本は貸出中です
本が返却されました
本を貸し出しました
 */
