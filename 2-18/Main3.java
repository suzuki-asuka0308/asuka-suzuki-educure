public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";  // 逆順にする文字列
        String output = reveseString(input);
        // ここにコードを書いてください
        System.out.println("入力:" + input);
        System.out.println("出力" + output);
    }

    public static  String reveseString(String str) {
        return new StringBuilder(str).reverse().toString();
    
    }
}