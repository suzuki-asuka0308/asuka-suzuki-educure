public class Account {
    private String accountNumber; // 口座番号
    private int balance; // 残高

    // コンストラクタ（口座番号を設定し、残高を0に初期化）
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0; // 初期残高は0
        /*new Account("12345") を実行すると、
        accountNumber が設定され、balance は 0円 になる！ */
        //ポイント：コンストラクタは new したときに実行される！
        //口座を作るときに accountNumber を設定し、残高を 0 にする！
        //new しないと口座は作れない！
        //コンストラクタは new したときに実行される！
    }

    // 入金メソッド
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円入金しました。");
        } else {
            System.out.println("無効な入金額です。");
        }
        //deposit(1000); を実行すると、残高が +1000円 増える！
        //ポイント：「balance += amount; で残高を増やす！」
        //amount > 0 のチェックで、マイナスの金額を防ぐ！
    }

    // 出金メソッド
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "円出金しました。");
        } else {
            System.out.println("出金できません。残高不足または無効な金額です。");
        }
        //「withdraw(500); を実行すると、残高が -500円 減る！」
        //ポイント：「amount <= balance をチェックして、残高以上の出金を防ぐ！
        //メソッドを使うと、残高を安全に管理できる！
    }

    // 残高を表示するメソッド
    public void displayBalance() {
        System.out.println("口座番号：" + accountNumber);
        System.out.println("残高：" + balance + "円");
        
    }
}