// Animal を継承した Cat クラス
public class Cat extends Animal {
    // 鳴くメソッドをオーバーライド
    @Override
    public void makeSound() {
        System.out.println("猫の鳴き声：ニャー！");
    }
}