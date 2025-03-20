public class Main4 {
    public static void main(String[] args) {
        // Dog のインスタンスを作成（ポチ, 3歳）
        Dog dog = new Dog("ポチ", 3);
        //new Dog("ポチ", 3); で Dog クラスのオブジェクトを作成！
        /*コンストラクタ Dog(String name, int age) に
         "ポチ" と 3 を渡して name と age をセットする！ */
        //つまり、この dog には name = "ポチ" と age = 3 のデータが入っている！
        //new でオブジェクトを作るときに、name と age がセットされる！

        // 鳴く
        dog.makeSound();
        //Dog クラスでオーバーライドされた makeSound() が実行される
        //makeSound() は Dog 独自の動作として、「ワンワン」と出力される！


        // 食事をする
        dog.eat();
        //Dog クラスでオーバーライドされた eat() が実行される
        
    }
}