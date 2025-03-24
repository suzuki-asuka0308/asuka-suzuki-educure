public class Main3 {
    public static void main(String[] args) {

        // 【要件：初期の貸出可能な本の冊数を表示】
        // まずは貸出可能な本の数を取得して、画面に表示する（100冊のはず）
        System.out.println("貸出可能な本: " + Library.getAvailableBooks() + "冊");

        // 【要件：本を借りる】
        // LibraryクラスのborrowBook()メソッドを呼び出して、本を1冊借りる（在庫が1減る）
        Library.borrowBook();

        // 【要件：貸出可能な本の冊数を表示】
        // 借りた後の残り冊数をもう一度表示（99冊になっているはず）
        System.out.println("貸出可能な本: " + Library.getAvailableBooks() + "冊");

        // 【要件：本を返却する】
        // LibraryクラスのreturnBook()メソッドを呼び出して、本を1冊返却する（在庫が1増える）
        Library.returnBook();

        // 【要件：貸出可能な本の冊数を表示】
        // 返却後の貸出可能な冊数を表示（100冊に戻っているはず）
        System.out.println("貸出可能な本: " + Library.getAvailableBooks() + "冊");
    }
}