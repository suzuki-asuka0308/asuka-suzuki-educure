import java.util.ArrayList;
import java.util.Collections;


public class Main3 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        ArrayList<Character> list = new ArrayList<Character>();

        Character c1 = new Character("勇者A", 100, 50);
        Character c2 = new Character("魔法使いB", 70, 70);
        Character c3 = new Character("戦士C", 80, 40);

        list.add(c1);
        list.add(c2);
        list.add(c3);

        Collections.sort(list);

        System.out.println("--- 戦闘力順 ---");

        for(Character c : list) {
            System.out.println(c);
        }

    }

   
}