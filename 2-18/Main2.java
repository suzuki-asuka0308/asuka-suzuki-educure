public class Main2 {
    public static void main(String[] args) {
        int score = 85;
        String result = getGrade(score);
        System.out.println("成績: " + result);
    }

    public static String getGrade(int score) {
        if (score >= 80) {
            return "優";
        }
        else if (score >= 60) {
            return "良";
        }
        else {
            return "可";
        }
    }
}