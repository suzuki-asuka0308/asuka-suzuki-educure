public class Book { // Book（本）というクラスを定義する

    // 本のタイトルと、貸し出されているかどうかを、このクラスの中だけで使えるようにする
    private String title;     // タイトル（例："Java入門"など）
    private boolean isLent;   // 貸し出し中かどうか（trueなら貸し出し中）

    // 本を作るときに、タイトルを受け取って設定し、貸出状態は「未貸出（false）」にする
    public Book(String title) {
        this.title = title;      // 渡されたタイトルを、この本のtitleにセットする
        this.isLent = false;     // 最初は貸し出していない状態にしておく
    }

    // 本のタイトルを外から見たいときに使う（中のtitleを返すだけ）
    public String getTitle() {
        return title; // タイトルを返す
    }

    // 貸し出されているかどうかを外から確認したいときに使う
    public boolean isLent() {
        return isLent; // trueなら貸出中、falseなら未貸出
    }

    // この本の貸出状態を変更するためのメソッド（protectedなので、Libraryクラスなど限られた場所からだけ使える）
    protected void setLent(boolean isLent) {
        this.isLent = isLent; // trueを渡せば貸出中に、falseを渡せば未貸出にする
    }
}