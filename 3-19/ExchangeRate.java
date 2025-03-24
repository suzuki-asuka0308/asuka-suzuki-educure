// ExchangeRate クラス：為替レートを管理するクラス（要件：ExchangeRateクラスを作成）
public class ExchangeRate {

    // 【要件：static double usdRate（ドルレート）と eurRate（ユーロレート）を持つ】
    // static（静的）なフィールド：ドルのレート（クラス全体で共有される）
    // 【要件：ドルレートの初期値は145.0】
    /*staticな変数やメソッドは「全体で共有」される*/
    /*クラス名から直接呼び出せる（インスタンスを作らなくていい） */
    private static double usdRate = 145.0;

    // static（静的）なフィールド：ユーロのレート（クラス全体で共有される）
    // 【要件：ユーロレートの初期値は160.0】
    private static double eurRate = 160.0;

    // 【要件：static void updateRates(double newUsdRate, double newEurRate)でレート更新】
    // 為替レートを更新する静的メソッド
    public static void updateRates(double newUsdRate, double newEurRate) {
        // 新しいドルレートをusdRateに代入
        usdRate = newUsdRate;

        // 新しいユーロレートをeurRateに代入
        eurRate = newEurRate;

        // レートを更新したことを表示
        System.out.println("レート更新");
    }

    // 【要件：static double toJPY(String currency, double amount)で日本円に換算】
    // 通貨と金額を受け取り、日本円に換算して返す静的メソッド
    public static int toJPY(String currency, double amount) {
        // 【要件：currencyが"USD"または"EUR"の場合、対応するレートで計算】
        // もし通貨がUSD（ドル）の場合
        if (currency.equals("USD")) {
            // 金額 × ドルレート を計算し、int型に変換（小数点以下は切り捨て）
            return (int)(amount * usdRate);
            /*条件分岐（if）で通貨を判定して処理を分ける*/
            /*(int)で小数点を切り捨てる */
        }
        // もし通貨がEUR（ユーロ）の場合
        else if (currency.equals("EUR")) {
            // 金額 × ユーロレート を計算し、int型に変換（小数点以下は切り捨て）
            return (int)(amount * eurRate);
            /*条件分岐（if）で通貨を判定して処理を分ける */
            /*(int)で小数点を切り捨てる */
        }
        // 【要件：それ以外の場合は-1を返す】
        // 通貨がUSDでもEURでもない場合は -1 を返す（対応外）
        else {
            return -1;
        }
    }
}

/*

static を使えば、インスタンスは不要
public class ExchangeRate {
    private static double usdRate = 145.0;

    public static double getUsdRate() {
        return usdRate;
    }
}

System.out.println(ExchangeRate.getUsdRate()); // ← インスタンスを作らず直接呼べる！

結論：「staticがある」とどうなるの？
区分
staticなし（普通）
staticあり（静的）
使うときの手順
new でインスタンスを作る必要あり
インスタンス不要、クラス名だけでOK
使い方の例
Sample s = new Sample();
ExchangeRate.toJPY(...)
向いてる用途
個別のデータを持つもの
共有すべきデータや処理

new ExchangeRate() が要らない理由は？
usdRate / eurRate は全員で共通のレート（1つだけあればいい）

 */

 /*public static void updateRates(double newUsdRate, double newEurRate) {
    usdRate = newUsdRate;
    eurRate = newEurRate;
}
  * 静的メソッド updateRates() は、静的フィールド（usdRate, eurRate）を変更するための機能
  
  */