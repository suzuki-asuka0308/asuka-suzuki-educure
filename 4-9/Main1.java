// メインクラス（プログラムのスタート地点）
public class Main1 {
    public static void main(String[] args) {
        // Calculatorクラスのインスタンス（= 中身を使うための箱）を作る
        Calculator calc = new Calculator();
        //calc という変数名で呼び出せるようにしてる

        // 割り算の実行を試す（try）ブロック
        try {
            // divideメソッドを呼び出して、10 ÷ 0 を計算しようとする
            // ここでエラーが起こる可能性がある（0で割ってるから）
            int result = calc.divide(10, 0);

            // エラーが起きなければ、結果を表示する
            System.out.println("10 ÷ 0 = " + result);
        } catch (ArithmeticException e) {
            // もし0で割ったときなどの算数エラーが起きたら、ここが実行される！

            // エラーメッセージを表示する（getMessageで中身を取り出す）
            System.out.println("10 ÷ 0 = エラー：" + e.getMessage());
        }
    }
}