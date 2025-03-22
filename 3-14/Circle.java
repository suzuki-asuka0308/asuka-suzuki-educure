public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        //コンストラクタ。オブジェクトを作るときに呼び出される処理。
        /*this.radius = radius; は「右の radius（引数）を、
        左の radius（フィールド）に代入してる」という意味。 */
        //例えば、new Circle(5.0); とすると radius に 5.0 が入る。
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
        /*	@Override は「親クラスの抽象メソッドを上書きして実装してますよ」というマーク。
        付けておくことで、ミスがあってもエラーにしてくれるから便利。 */
        //getArea() の中では、円の面積公式：π × 半径 × 半径 を使って計算している。
        //π（パイ）はここでは簡単に 3.14 として使っている（※正確にやるなら Math.PI でもOK）
    }
}