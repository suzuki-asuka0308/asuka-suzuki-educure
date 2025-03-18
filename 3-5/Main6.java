public class Main6 {
    public static void main(String[] args) {
        // 口座を作成
        Account account = new Account("12345");

        // 口座情報を表示
        account.displayBalance();

        // 1000円入金
        account.deposit(1000);
        account.displayBalance(); // 入金後の残高を表示

        // 500円出金
        account.withdraw(500);
        account.displayBalance(); // 出金後の残高を表示
    }
}