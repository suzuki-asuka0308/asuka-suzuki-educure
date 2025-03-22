// 抽象クラス Animal
public abstract class Animal {
    // 抽象メソッド（鳴くメソッド）
    //abstract class Animal は「抽象クラス」
    //共通のルールや性質を定義するためのクラス。
    //インスタンス（new Animal()）を直接作ることはできない。
    //ここでは、「すべての動物は makeSound() を持っているべき」というルールを定めている。
    public abstract void makeSound();
    //abstract をつけることで、このメソッドには中身（処理内容）がない。
    //この時点では「鳴くという機能がある」とだけ決めておく。
    //具体的にどう鳴くのか（ワンワンなのかニャーなのか）は、子クラス（DogやCat）が決める！
}

/*Animal（抽象クラス） →「すべての動物は鳴くよ」とだけ決めてる。
	Dog →「ワンワンと鳴く」
	Cat →「ニャーと鳴く」
つまり、Animal は設計図のような役割で、実体（オブジェクト）
を作るためには必ず子クラスが必要なんだ！ */

//abstract を見たら → 「ルールだけ決めてて、処理は後から
//abstract class は → 「共通の性質や機能の型を作る」
//abstract なメソッドがあるクラスは → 自分で new できない

//子クラス（Dog, Cat など）で makeSound() を必ず書かないとエラーになる。