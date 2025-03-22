public class Main1 {
    public static void main(String[] args) {
        // 犬と猫のインスタンスを作成（Animal 型で宣言）
        Animal dog = new Dog();
        Animal cat = new Cat();
   

        // 鳴き声を出す（多態性を利用）
        dog.makeSound();
        cat.makeSound();
    }
}