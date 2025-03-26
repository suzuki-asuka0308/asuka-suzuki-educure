public class Main1 {
    public static void main(String[] args) {
        String str1 = "Hello";  // 要件1：元の文字列1: Hello を表示
        String str2 = "World";  // 要件2：元の文字列2: World を表示

        // str1 に入っている "Hello" を出力
        System.out.println("元の文字列1: " + str1);  // 要件1

        // str2 に入っている "World" を出力
        System.out.println("元の文字列2: " + str2);  // 要件2

        // str1 と str2 を連結し、新しい文字列 combined を作成する（"HelloWorld" になる）
        String combined = str1 + str2;

        // 連結後の文字列を出力
        System.out.println("連結後: " + combined);  // 要件3：文字列1と文字列2を連結し、連結後の文字列を表示

        // combined からインデックス2〜6の文字を切り出す（"lloWo"）
        String sub = combined.substring(2, 7);

        // 部分文字列を出力
        System.out.println("部分文字列(3-7): " + sub);  // 要件4：連結した文字列から3〜7文字目を取り出して表示
    }
}