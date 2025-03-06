public class Main5 {
    public static void main(String[] args) {
        int note = 280;
         note *= 3;
        int pen = 120;
        pen *= 5;
        int eraser = 100;
        eraser *= 2;
        int money = 2000;

        int subtotal = note + pen + eraser;
        int tax = (int) (subtotal * 0.1);
        int total = subtotal + tax;
        int change = money - total;



        System.out.println("小計:" + subtotal + "円");
        System.out.println("消費税:" + tax + "円");
        System.out.println("合計金額:" + total + "円");
        System.out.println("おつり" + change + "円");

    }
    
}
