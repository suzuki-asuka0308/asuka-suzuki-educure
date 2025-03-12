import java.util.Date;

public class Main3 {
    public static void showCurrentTime() {
        // 現在の日時を取得
        Date currentDate = new Date();
        
        // 現在の日時を表示
        System.out.println("現在の日時: " + currentDate.toString());
    }

    public static void main(String[] args) {
        showCurrentTime();  
    }
}