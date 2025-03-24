public class Main1 {
    public static void main(String[] args) {

        // 【要件7-1】初期残高1000円の銀行口座を作成し残高を表示
        BankAccount account = new BankAccount(1000);
        System.out.println("残高: " + account.getBalance() + "円");

        // 【要件7-2】2000円入金し残高を表示
        account.deposit(2000);
        System.out.println("残高: " + account.getBalance() + "円");

        // 【要件7-3】1500円出金し残高を表示
        account.withdraw(1500);
        System.out.println("残高: " + account.getBalance() + "円");

        // 【要件7-4】残高不足の場合の引き出しを試みる
        account.withdraw(2000); // 残高不足でエラー
    }
}