// Calculator というクラス（割り算の機能を持たせるクラス）を作成
public class Calculator {

    // divide（ディバイド）というメソッドを作る
    // 「2つの整数 a と b を受け取って、a ÷ b を計算して返す」ことをする
    // もし 0 で割ろうとしたら ArithmeticException を投げる（throws）
    public int divide(int a, int b) throws ArithmeticException {

        // もし b が 0（割る数が0）だったら
        if (b == 0) {
            // エラーを発生させる（ArithmeticException を投げる）
            // メッセージ「0で割ることはできません」も一緒に投げる
            throw new ArithmeticException("0で割ることはできません");
        }

        // b が 0 じゃなければ、a ÷ b の結果を返す（普通の割り算）
        return a / b;
    }
}