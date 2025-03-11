public class Main3 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6];
        seats[0][2] = 1;
        seats[1][1] = 1;
        seats[1][4] = 1;
        seats[3][0] = 1;
        seats[3][5] = 1;
        seats[4][2] = 1;
        
        System.out.println("現在の座席状況:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }
        
        int row = 3;
        int col = 4;

        if (row < 1 || row > 5 || col < 1 || col > 6) {
            System.out.println("無効な座席番号です。");
        } else {
            if (seats[row - 1][col - 1] == 1) {
                System.out.println("指定された座席はすでに予約済みです。");
            } else {
                seats[row - 1][col - 1] = 1;
                System.out.println(row + "行" + col + "列の座席を予約しました");
            }
        }
    }
}