public class BankAccount {
    private int balance; // 残高
    /*private → 他のクラスから直接変更できない
	•	int → 整数（お金の金額）を扱う
	•	balance → 残高を管理する変数 */
    /*要件BankAccountクラスを作成し、
    balance（残高）のフィールドを持たせる」 */

    // コンストラクタ（初期残高を設定）
    public BankAccount() {
        this.balance = 0; // 初期残高は0円
        System.out.println("残高：" + balance + "円");
    /*クラス名と同じメソッド は コンストラクタ
	•	this.balance = 0; → 口座を作ると残高0円でスタート
	•	System.out.println("残高：" + balance + "円");
    → 初期残高を表示 */
    //要件口座のインスタンスを生成し、初期残高を表示

    }

    // 残高を取得するメソッド
    public int getBalance() {
        return balance;
    /*int getBalance() → 残高を取得するメソッド
	•	return balance; → 現在の残高を返す */
    //要件、残高を取得する getBalance メソッドを実装する
    }

    // お金を預けるメソッド
    public void deposit(int amount) {
        balance += amount; // 残高を増やす
        System.out.println(amount + "円預けました");
        System.out.println("残高：" + balance + "円");
    /*deposit(int amount) → 金額 amount を受け取る
	•	balance += amount; → 現在の残高に amount を足す
	•	預けた金額と、新しい残高を表示 */
    //要件、deposit（int amount）メソッドでお金を預け、預けた金額を表示する


    }

    // お金を引き出すメソッド
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("残高が不足しています");
        } else {
            balance -= amount; // 残高を減らす
            System.out.println(amount + "円引き出しました");
            System.out.println("残高：" + balance + "円");
    //withdraw(int amount) → 引き出す金額 amount を受け取る
    /*残高不足のチェックif (amount > balance) {
    残高より多く引き出そうとすると "残高が不足しています" を表示*/
    //残高が足りる場合balance -= amount;
    /*withdraw（int amount）メソッドでお金を引き出す
    （残高が不足している場合はメッセージを表示） */

        }
    }
}








/*シナリオ：銀行の口座を管理するシステムを作成する。
﻿目的：フィールドの値の更新方法を理解する。
﻿﻿要件：
﻿BankAccountクラスを作成し、balance（残高）のフィールドを持たせる
﻿残高を取得するgetBalanceメソッドを実装する
﻿﻿deposit（int amount）メソッドでお金を預け、預けた金額を表示する
﻿﻿withdraw（int amount）メソッドでお金を引き出す（残高が不足している場合はメッセージを表示）
﻿﻿mainメソッドでは以下の処理を実装する：
﻿口座のインスタンスを生成し、初期残高を表示
﻿10000円を預ける
﻿3000円を引き出す
﻿残高不足となる8000円の引き出しを試みる
﻿作成するクラスとソースファイル名：
﻿﻿BankAccountクラス：BankAccount.java
﻿﻿Main3クラス： Main3.java
﻿期待される出力：残高：0円
10000円預けました
残高：10000円
3000円引き出しました
残高：7000円
残高が不足しています
 */