public class Main5 {
    public static void main(String[] args) {
        // 普通預金口座を作成（名義人: 山田太郎、初期残高: 10000）
        SavingsAccount account = new SavingsAccount("山田太郎", 10000);

        // 5000円入金
        account.deposit(5000);

        // 3000円出金
        account.withdraw(3000);

        // 口座情報を表示
        account.displayAccountInfo();
    }
}