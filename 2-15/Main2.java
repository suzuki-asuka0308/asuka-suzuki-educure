public class Main2 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        // ここに平均気温を計算するコードを書いてください
        double total = 0;
        for(double temperature : temperatures) {
            total += temperature;
        }
        double avg = total / temperatures.length;

       System.out.println("月曜日:" + temperatures[0] + "度");
       System.out.println("火曜日:" + temperatures[1] + "度");
       System.out.println("水曜日:" + temperatures[2] + "度");
       System.out.println("木曜日:" + temperatures[3] + "度");
       System.out.println("金曜日:" + temperatures[4] + "度");
       System.out.println("土曜日:" + temperatures[5] + "度");
       System.out.println("日曜日:" + temperatures[6] + "度");

       System.out.println("平均気温" + avg + "度");
        }
    }

