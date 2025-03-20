// Animal インターフェースを実装した Dog クラス
public class Dog implements Animal {
    private String name; // 犬の名前
    private int age; // 年齢

    //implements Animal を使うと、Dog クラスは Animal のルールを守らないといけない！
    /*Animal インターフェースには makeSound() と eat() が定義されているので、
    Dog では必ず実装しないとエラーになる！*/
    /*Animal インターフェースには makeSound() と eat() が定義されているので、
    Dog では必ず実装しないとエラーになる！ */
    /*インターフェースを implements すると、指定されたメソッドを必ず実装しなければならない！ */




    // コンストラクタ（名前と年齢を初期化）
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //this.name = name; で、引数の name をフィールド name に保存
    //this.age = age; で、引数の age をフィールド age に保存
    //これにより、オブジェクトを作るときに name と age を指定できる
    //コンストラクタで name と age をセットして、オブジェクトを作るときに初期化できる！

    // 鳴くメソッド（オーバーライド）
    @Override
    public void makeSound() {
        System.out.println("ワンワン");
        //@Override を使って、Animal インターフェースの makeSound() を実装
        //オーバーライドしないと、コンパイルエラーになる！
        //インターフェースの makeSound() をオーバーライドして、犬の鳴き声を定義！

    }

    // 食事をするメソッド（オーバーライド）
    @Override
    public void eat() {
        System.out.println(name + "が餌を食べています");
        //@Override を使って、Animal インターフェースの eat() を実装
        //name を使って、「○○が餌を食べています」と表示
        //例えば、name = "ポチ" の場合は「ポチが餌を食べています」となる！
        //犬ごとに異なる名前を使って、食事のメッセージを表示！
    }
}