// 配列にアクセスする専用のクラス（配列を渡して、中身を取り出す処理をする）
public class ArrayAccessor {

    // クラスの中で配列を保存するための変数（privateにして外から勝手に触れないようにする）
    private int[] array;

    // コンストラクタ（このクラスが new されたときに1回だけ呼ばれる特別なメソッド）
    // 引数として配列を受け取り、それをこのクラスの変数 array に保存する
    public ArrayAccessor(int[] array) {
        this.array = array; // 受け取った配列をこのクラスの配列（this.array）に代入
    }

    // 指定した index 番号の要素を返すメソッド
    // もし index が配列の範囲外だったら、例外（エラー）を発生させる
    public int getElement(int index) throws ArrayIndexOutOfBoundsException {
        // index が 0 未満 または 配列の長さ以上だったら範囲外とみなす
        if (index < 0 || index >= array.length) {
            // 範囲外アクセスなので、例外を「投げる」→ 呼び出し元でキャッチしてもらう
            throw new ArrayIndexOutOfBoundsException();
        }

        // 範囲内なら、その index 番号の要素を返す
        return array[index];
    }
}