public class Main3 {
    public static void main(String[] args) {
        // 1から5の段を表示
        // ここにコードを書いてください
        for (int i =1; i <= 5; i++) 
            for(int j =1; j<= 9; j++) {
           System.out.println(i + " X " + j + "=" + (i * j));
        }
        System.out.println();
    }
}