import java.util.ArrayList;
import java.util.List;

// BankAccount インターフェースを実装した普通預金口座クラス
public class SavingsAccount implements BankAccount {
    private String accountHolder;  // 口座名義人
    private int balance;  // 残高
    private List<String> transactionHistory;  // 取引履歴

    //implements BankAccount によって、BankAccount インターフェースのルールを守る必要がある！
    /*つまり、BankAccount で定義されたメソッド (deposit(), withdraw(), getBalance(), 
    displayAccountInfo()) を必ず実装しないとエラーになる！ */
    //銀行口座には絶対にこの機能が必要！」というルールを守らせるための仕組み！
    //implements すると、BankAccount にあるメソッドを全部 @Override しないといけない！

    // コンストラクタ（口座名義人と初期残高をセット）
    public SavingsAccount(String accountHolder, int initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("口座作成: 初期残高 = " + initialBalance);
        //accountHolder → 口座の持ち主の名前（"山田太郎" など）
        //balance → 口座の現在の残高（10000 など）
        //transactionHistory → 口座の取引履歴をリストで管理！（List<String> を使用）
        //this.accountHolder = accountHolder; → 口座の名義人をセット
        //this.balance = initialBalance; → 初期残高をセット
        //this.transactionHistory = new ArrayList<>(); → 取引履歴のリストを作成
        //最初の取引履歴として「口座作成: 初期残高 = 初期値」を追加！
        //口座を作ったら、すぐに「口座作成」の履歴を追加しておく！

    }

    // 入金処理
    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("入金: " + amount);
            //amount > 0 のときだけ入金を受け付ける！（マイナスの入金を防ぐ）
            //balance += amount; で残高を増やす
            //取引履歴 transactionHistory.add("入金: " + amount); に記録を追加する
            //入金のたびに、残高を増やして履歴を記録！
        }
    }

    // 出金処理（残高が足りない場合は出金できない）
    @Override
    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("出金: " + amount);
            return true;
        } else {
            System.out.println("エラー: 残高不足または無効な金額");
            return false;
            //amount > 0 && balance >= amount のときだけ出金できる！（残高不足やマイナス出金を防ぐ）
            //balance -= amount; で残高を減らす
            //取引履歴 transactionHistory.add("出金: " + amount); に記録を追加する
            //•	出金成功 → return true; / 出金失敗 → return false;


        }
    }

    // 残高照会
    @Override
    public int getBalance() {
        return balance;
        //現在の balance（残高）を返す
        //例えば account.getBalance(); を呼び出すと、現在の残高が取得できる！
        //getBalance() は、残高を返すだけのシンプルなメソッド！」

    }

    // 口座情報の表示
    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人: " + accountHolder);
        System.out.println("残高: " + balance);
        System.out.println("取引履歴:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
            //口座の情報（名義人、残高）を表示
            //取引履歴 transactionHistory を for 文で1つずつ表示
            //口座の基本情報＋取引履歴をすべて表示する！
        }
    }
}