

public class Pet {
    /*１クラス定義 */
    
    /*２フィールド（インスタンス変数） */
    /*name と energy は、各ペットごとに異なる値を持つ（インスタンス変数） */
    //名前と体力のフィールド
    private String name;
    private int energy;
    //外部から直接アクセスできない

    /*３コンストラクタ*/
    //コンストラクタ
    /*インスタンス(オブジェクト)を作成するときに最初に呼び出される
    特別なメゾット*/
    public Pet(String name, int energy) {  // クラス名に合わせて修正
        this.name = name;
        this.energy = energy;
        //右側の name は、引数で受け取った値
        /*this.name は クラスのフィールド。
         this を使うことで、区別して代入している
        this.energy = energy;
        引数で受け取った体力をフィールドに代入 */

        /*このコンストラクタによって、ペットの名前と体力を設定できる！ */
    }  // コンストラクタの `}` を追加

    /*４Getter（値を取得する） & Setter（値を設定する */
    // 名前のgetterとsetterメソッド
    public String getName() {
        return name;
        //getName() は、name の値を取得するためのメソッド。
    }

    public void setName(String name) {
        this.name = name;
        //setName(String name) は、name を新しい値に変更するためのメソッド。
        //名前を変えたいときに使う
    }

    // 体力のgetterとsetterメソッド
    public int getEnergy() {
        return energy;
        //getEnergy() は、現在の体力を取得するためのメソッド。

    }

    public void setEnergy(int energy) {
        this.energy = energy;
        //setEnergy(int energy) は、体力を変更するためのメソッド。
    }
    
    /*行動メゾット */
    //食事のメゾット
    public void eat() {
        energy += 10;
        System.out.println(name + "は食事をしてから元気になった！");
        showEnergy();
        //eatを呼ぶと体力が10になる
        //ペットの名前とメッセージを表示

        /*これらの Getter / Setter によって、外部から name や energy
         にアクセスできるようになる！*/
    }
    
    // 遊びのメソッド
    public void play() {
        energy -= 20;
        System.out.println(name + "は遊んでくれた！");
        showEnergy();
        //ペットが遊んで疲れたことを表示
        //play()を呼ぶと体力が20減る
    }  // `play()` メソッドの `}` の位置を修正

    // 体力を表示するメソッド
    public void showEnergy() {
        System.out.println("現在の体力:" + energy);
        //現在の体力を表示するメソッド
        //メッセージの後に energy の値を出力
        //showEnergy() を呼ぶと、今の体力が表示される！
    }
}

/*

メソッド
説明
getName()
ペットの名前を取得
setName(String name)
ペットの名前を設定
getEnergy()
現在の体力を取得
setEnergy(int energy)
体力を設定
eat()
体力を 10 回復
play()
体力を 20 減少
showEnergy()
現在の体力を表示
 */