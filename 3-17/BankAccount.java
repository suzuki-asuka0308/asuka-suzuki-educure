public class BankAccount {
    private int balance;
    //データ（balance）を守るために外部から触れさせない。操作は専用のメソッドからだけ。

    // コンストラクタ
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        //クラス名と同じ名前の特別なメソッド。
        //オブジェクト作成時に最初の値（初期残高）をセット。
    }

    // 残高取得メソッド
    public int getBalance() {
        return balance;
        //getBalance()：値を「取得」する（getter）
    }

    // 入金メソッド
    public void deposit(int amount) {
        //【要件4】deposit(int amount)メソッドで入金
        if (amount <= 0) {
            //【要件6】整数以外や0以下の値が指定された場合のエラーメッセージ
            //金額（amount）が0以下だったら」という条件。
            /*入金や出金の金額として、0円とかマイナスの金額っておかしい
             * -100円入金する → 実際は出金になってしまう危険性あり！
             * だから「金額は1円以上でなければならない」というルールを作って、エラーとして扱う */
            System.out.println("入金額は正の整数で指定してください。");
            return;
            //deposit()：値を「増やす」処理
        }
        balance += amount;
        //要件4】入金処理（残高に加算）
        System.out.println(amount + "円入金しました");
    }

    // 出金メソッド
    public void withdraw(int amount) {
        //【要件5】withdraw(int amount)メソッドで出金（残高が不足する場合は出金不可）
        if (amount <= 0) {
            //要件6】整数以外や0以下の値が指定された場合のエラーメッセージ
            System.out.println("出金額は正の整数で指定してください。");
            return;
            //withdraw()：値を「減らす」処理＋条件分岐（エラーハンドリング）
        }
        if (balance >= amount) {
            //残高（balance）が、引き出したい金額（amount）以上なら」という条件
            //銀行でお金を引き出すとき、残高より多い金額は引き出せない
            //例：残高1000円なのに2000円引き出そうとしたら→エラー
            //このif文は、「お金が足りてるか？」をちゃんと確認するためのもの
            //要件5】出金処理（残高が足りている場合）
            balance -= amount;
            System.out.println(amount + "円引き出しました");
        } else {
            System.out.println("引き出しに失敗しました。残高が不足しています。");
            //残高が足りている場合は、引き出した分だけ残高を減らす」って流れ
            //要件5】残高不足時のエラーメッセージ表示
        }
    }
}