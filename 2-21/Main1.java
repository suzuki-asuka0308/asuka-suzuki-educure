public class Main1 {
    public static void processString(String input) {
        String upperCaseString = input.toUpperCase();  // 文字列を大文字に変換
        int length = upperCaseString.length();          // 文字列の長さ（文字数）を取得

        System.out.println("入力: \"" + input + "\"");
        System.out.println("出力: \"" + upperCaseString + "\"");
        System.out.println("文字数: " + length);
    }

    public static void main(String[] args) {
        String input = "Hello World";  // 使用する文字列
        processString(input);  // メソッドを呼び出して処理
    }
}