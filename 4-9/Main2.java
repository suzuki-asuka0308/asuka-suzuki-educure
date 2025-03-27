// プログラムのスタート地点となるクラス
public class Main2 {
    public static void main(String[] args) {

        // 配列を作成。中身は 10, 20, 30（indexは0〜2）
        int[] numbers = {10, 20, 30};

        // ArrayAccessor クラスのインスタンスを作成（numbers配列を渡す）
        ArrayAccessor accessor = new ArrayAccessor(numbers);

        // ========= 位置1の要素を表示する =========
        System.out.println("位置1の要素");

        // accessor.getElement(1) → 配列の2番目（index 1）の要素を取り出す → 20
        System.out.println(accessor.getElement(1));

        // ========= 位置5の要素を表示しようとする（→ エラーになる） =========
        System.out.println("\n位置5の要素");

        // getElement(5) は配列の範囲外（index 5 は存在しない！）
        // だから try-catch を使ってエラーをキャッチ（捕まえる）する
        try {
            // この行でエラーが起きるので、下の catch にジャンプする
            System.out.println(accessor.getElement(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            // エラーが起きたときに表示されるメッセージ
            System.out.println("エラー：指定された位置は範囲外です");
        }
    }
}