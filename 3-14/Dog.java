// Animal を継承した Dog クラス
public class Dog extends Animal {
    // 鳴くメソッドをオーバーライド
    /*Dog は Animal を継承している
    → つまり、Animal クラスにあるルール（例：必ず makeSound() 
    を持つ）を守らなきゃいけない。 */
    /*Animal は抽象クラスなので、中身は空っぽのメソッドしかない。
    実際の動きはここ（子クラス）で作る！ */


    @Override
    public void makeSound() {
        System.out.println("犬の鳴き声：ワンワン！");
        //@Override：親クラスの makeSound() を「上書き」してますよ！という印
        /*public void makeSound()：Animal で決められてたメソッドを、
        ここで実際に使える形にしている */
    }
}