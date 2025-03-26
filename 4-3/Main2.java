public class Main2 {

    // 指定された長さでメッセージを省略するメソッド
    // 省略が必要なら末尾に "..." を付ける
    public static String shortenMessage(String message, int maxLength) {

        // もしメッセージの長さが maxLength 以下だったら、何もせずそのまま返す
        if (message.length() <= maxLength) {
            return message;
        }

        // StringBuilder を使って文字列を組み立てる（省略処理）
        StringBuilder sb = new StringBuilder();

        // 先頭から maxLength 文字までを切り出して追加（例：0〜9文字）
        sb.append(message.substring(0, maxLength));

        // 最後に "..." をつけて省略の印をつける
        sb.append("...");

        // 完成した省略後の文字列を返す
        return sb.toString();
    }

    public static void main(String[] args) {
        // もとのメッセージ（長めの文章）
        String message = "これは非常に長いチャットメッセージです。省略する必要があります。";

        // 原文をそのまま表示（要件：原文の表示）
        System.out.println("原文: " + message);

        // メッセージを10文字で省略して表示（要件：10文字で省略）
        System.out.println("省略後(10文字): " + shortenMessage(message, 10));

        // メッセージを20文字で省略して表示（要件：20文字で省略）
        System.out.println("省略後(20文字): " + shortenMessage(message, 20));
    }
}