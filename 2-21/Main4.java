import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void processNumbers(int[] numbers) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        System.out.println("元のリスト: " + numberList);

        Collections.sort(numberList);
        System.out.println("ソート後: " + numberList);

        int max = Collections.max(numberList);
        int min = Collections.min(numberList);
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        processNumbers(numbers);
    }
}