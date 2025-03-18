public class BankAccount {
    private int balance; // 残高フィールド

    // コンストラクタ
    public BankAccount(int balance) {
        this.balance = balance;
        //コンストラクタは new するときに呼ばれる！
    
    }

    // 残高を取得するメソッド
    public int getBalance() {
        return balance;
        //データを変更するときに使う！
        //get〇〇() はデータを取得するためのメソッド！
    }

    // 残高を変更するメソッド
    public void setBalance(int balance) {
        this.balance = balance;
        //set はデータを変更するときに使う！
        //set〇〇() はデータを変更するメソッド！
    }
}