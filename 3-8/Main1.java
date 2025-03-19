public class Main1 {
    public static void main(String[] args) {
        // Swordオブジェクトを作成
        Sword sword = new Sword("ブロンズソード", 10);
        //new を使うと Sword のコンストラクタが実行される！
        //ブロンズソード" → name にセット
        //10 → power にセット
        /*Sword クラスは Weapon を継承しているので、
        super(name, power); が実行され、Weapon のコンストラクタが呼ばれる！ */

        // 武器名と攻撃力を表示
        System.out.println("武器名: " + sword.getName());
        System.out.println("攻撃力: " + sword.getPower());
        //sword.getName() で武器の名前を取得し、sword.getPower() で攻撃力を取得する
        /*ポイント：「Sword クラスには getName() や getPower() 
        はないけど、Weapon から継承しているから使える！ */
        //Weapon クラスの getName() メソッドが呼ばれる
        //Weapon クラスの getPower() メソッドが呼ばれる
        //継承を使うと、親クラスのメソッドをそのまま使える！
    }
}

        //Sword のインスタンスを作成したら、Weapon のメソッドがそのまま使える！
        //継承を使うと、コードがシンプルになり、共通の機能を再利用できる！

        /*項目
         覚えること
         new を使う
         Sword のオブジェクトを作成（Weapon のコンストラクタが呼ばれる）
        ゲッターメソッドを使う
        getName() で名前、getPower() で攻撃力を取得
        継承の効果
        Sword クラスに何も書かなくても、Weapon のメソッドが使える
        */

        //new を使うと、オブジェクトが作られて、コンストラクタが動く！
        //getName() や getPower() は Weapon クラスから継承している！
        