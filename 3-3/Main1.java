public class Main1 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        //ペットのインスタントを生産
        Pet pet = new Pet("ポチ",100);
        System.out.println(pet.getName() + "を生み出しました！");
        /*new Pet("ポチ", 100);
        Pet クラスのコンストラクタを呼び出し、ペットの名前を「ポチ」、体力を 100 に設定。
        Pet pet = ...
        pet という変数に、新しく作った Pet オブジェクトを代入。 */
   
        //初期体力を表示
        pet.showEnergy();
        //showEnergy() メソッドを呼び出して、体力を表示。

        //食事をさせる
        pet.eat();
        pet.showEnergy();
        //eat() メソッドを呼び出して、体力を +10 する。
        //energy += 10; によって、energy が 100 → 110 に増加。
        //showEnergy(); を呼び出して、現在の体力を表示。

        //遊ばせる
        pet.eat();
        pet.showEnergy();
        //play() メソッドを呼び出して、体力を -20 する。
        /*energy -= 20; によって、energy が 110 → 90 に減少。
         showEnergy(); を呼び出して、現在の体力を表示。 */



    }
}


/*Pet pet = new Pet("ポチ", 100);
ポチを作成（体力100）
System.out.println(pet.getName() + "を生み出しました！");
ポチを生み出したことを表示
pet.showEnergy();
体力を表示（100）
pet.eat();
食事をさせ、体力+10（110）
pet.play();
遊ばせ、体力-20（90）
 */