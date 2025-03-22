public class Rectangle extends Shape {
    private double width;
    private double height;
    //Rectangle クラスは Shape クラスを継承してる（extends）。
    //*Shape が抽象クラスなので、そこで決められた getArea() メソッドを必ず書く必要がある。

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        //長方形の「幅」と「高さ」を表す変数（フィールド）。
        //private にすることで、外から勝手にいじられないようにしてる（カプセル化）。
        //コンストラクタ（クラスが呼ばれたときに最初に動く処理）。
        /*this.width = width は、「受け取った引数（右の width）を、
        このクラスの width（左）に代入してるよ」という意味。 */
        //オブジェクトを作るときに new Rectangle(5.0, 10.0) みたいに使う！
    }

    @Override
    public double getArea() {
        return width * height;
        //@Override は「親クラスの抽象メソッドを上書きしてます！」という宣言。
        //この中身で実際に長方形の面積を計算している。
        //width * height → 幅 × 高さ = 面積（長方形の公式）。

    }
}