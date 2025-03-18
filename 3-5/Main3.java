public class Main3 {
    public static void main(String[] args) {
        // 3000円の残高を持つBankAccountインスタンスを作成
        BankAccount account1 = new BankAccount(3000);
        //new を使うと、BankAccount のオブジェクトが作られる。
        //account1 は、そのオブジェクトを指している。
        //オブジェクトを作るときは new を使う
        //account1 には「オブジェクトの実体」ではなく、「オブジェクトの参照」が入る

        // account2 も account1 を参照（同じインスタンス）
        BankAccount account2 = account1;
        //これは「account1 を account2 にコピーしている」のではない
        //account2 も account1 と同じオブジェクトを参照する」ことになる
        //オブジェクトを代入すると、「データのコピー」ではなく「参照のコピー」になる
        //つまり account1 も account2 も同じオブジェクトを見ている

        //*片方の変数で値を変更すると、もう片方にも影響があることを確認する

        //何をするコード→参照型の動作を確認するためのコード

        // 口座の残高を取得して表示
        System.out.println("口座1の残高：" + account1.getBalance());
        System.out.println("口座2の残高：" + account2.getBalance());

        // account1 の残高を変更
        account1.setBalance(5000);
        //account1 の残高を 5000 に変更すると、account2 の残高も 5000 になる
        //これは「同じオブジェクトを共有しているから
        //参照型の変数を2つ作っても、同じオブジェクトを見ていれば、片方を変えるともう片方も変わる
        //account1 も account2 も、どちらも同じ BankAccount のオブジェクトを見ている

        // 口座の残高を再表示（両方とも変更されていることを確認）
        System.out.println("口座1の残高：" + account1.getBalance());
        System.out.println("口座2の残高：" + account2.getBalance());
    }
}

    /*実行結果 最初は account1 も account2 も 3000円
    account1.setBalance(5000); を実行すると、account2 の残高も5000円になる！
👉 これは、「2つの変数が同じオブジェクトを見ている」から！*/

   /*覚えること
    new でオブジェクトを作る
    new を使うと、新しいオブジェクトが作られる
    オブジェクトの参照のコピー
    account2 = account1; は「データのコピー」ではなく「参照のコピー」
    オブジェクトの共有
    片方の変数でデータを変えると、もう片方も影響を受ける
   */

   /*new でオブジェクトを作ると、それを参照する変数ができる
   = で代入すると、新しいオブジェクトができるのではなく「参照のコピー」になる
   どちらかの変数でオブジェクトを変更すると、もう片方にも影響がある */