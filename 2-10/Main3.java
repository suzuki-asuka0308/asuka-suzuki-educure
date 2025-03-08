
public class Main3{
    public static void main(String[] args) {
        int month =4;
        String season;



        if (month < 1 || month> 12) {
            season = "無効な月です";
        } else if (month >=3 && month <=5) {
            season = "春"; 
        } else if (month >=6 && month <=8) {
            season = "夏";
        } else if (month >=9 && month <=11) {
            season = "秋";
        } else {
            season = "冬";
        }
         System.out.println("季節" + season);
        }
    }
    
