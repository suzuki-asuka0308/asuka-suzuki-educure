// 銀行口座の共通インターフェース
public interface BankAccount {
    //interface は「クラスではなく、ルールを定めるもの」
    /*この BankAccount を implements したクラスは、
    ここで定義されたメソッドを必ず実装しなければならない*/
    //「銀行口座の基本機能を定める設計図」のようなもの
    //インターフェースは、口座の共通ルールを定める設計図！
    void deposit(int amount);  // 入金
    //	入金処理を行うメソッド
    //amount に指定された金額を残高に加算する
	//戻り値は void（何も返さない）
    //deposit() は「入金する処理」のためのメソッド！
    boolean withdraw(int amount);  // 出金
    //出金処理を行うメソッド
    //amount に指定された金額を残高から引く
    //戻り値は boolean（true or false）
    //出金成功なら true、残高不足などで出金できなければ false を返す
    //withdraw() は「出金する処理」で、成功したかどうかを true / false で返す！
    int getBalance();  // 残高照会
    //現在の残高を取得するメソッド
    //戻り値は int（現在の残高）
    //getBalance() は「今の残高を取得するためのメソッド！
    void displayAccountInfo();  // 口座情報表示
    //口座の詳細情報を表示するメソッド
    //具体的には「口座名義人」「残高」「取引履歴」などを表示する
    //戻り値は void（何も返さない）
    //displayAccountInfo() は「口座の情報を表示するためのメソッド！

}

//interface は「ルールだけ定めるもの」で、implements したクラスで実装する！」
//deposit() withdraw() getBalance() displayAccountInfo() の役割をしっかり理解する！
//実際に SavingsAccount などの実装クラスを書いて、動かしてみる！
//エラーが出たら、それを修正しながら理解を深める！

