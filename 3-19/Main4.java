public class Main4 {
    public static void main(String[] args) {

        // 【要件：初期の為替レートで100ドルを日本円に換算】
        // 最初はドルレートが145.0なので、100ドル → 14500円になるはず
        // ExchangeRateクラスのtoJPYメソッドを使って、日本円に換算する
        int jpy1 = ExchangeRate.toJPY("USD", 100);

        // 換算前の100ドルの値段を表示（行を分けて出力）
        System.out.println("100ドル＝");

        // 実際に換算された日本円の金額を表示（例：14500円）
        System.out.println(jpy1 + "円");

        // 【要件：レートを更新（ドル150.0、ユーロ160.0）】
        // ExchangeRateクラスのupdateRatesメソッドでドルレートとユーロレートを変更
        // 更新後、内部的に usdRate = 150.0 に変更される
        // コンソールに「レート更新」と表示される
        ExchangeRate.updateRates(150.0, 160.0);

        // 【要件：更新後の為替レートで100ドルを日本円に換算】
        // 新しいドルレート（150.0）を使って、再度100ドルを日本円に換算
        int jpy2 = ExchangeRate.toJPY("USD", 100);

        // 更新後のレートに基づいて、日本円での金額を表示（例：15000円）
        System.out.println("100ドル= " + jpy2 + "円");

        // 【要件：ユーロを換算（例：80ユーロ）】
        // 現在のユーロレート（160.0）を使って、80ユーロを日本円に換算
        int jpy3 = ExchangeRate.toJPY("EUR", 80);

        // 換算後の80ユーロの金額を表示（例：12800円）
        System.out.println("80ユーロ= " + jpy3 + "円");
    }
}