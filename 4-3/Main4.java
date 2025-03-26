import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main4 {
    private String eventName;                // イベント名
    private ZonedDateTime startTime;        // 開始日時
    private ZonedDateTime endTime;          // 終了日時

    // コンストラクタ：イベント名・開始/終了日時を初期化
    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    // イベント名を取得するgetterを追加（カプセル化の考え方）
    public String getEventName() {
        return eventName;
    }

    // イベント期間を「〇日と〇時間」で表示
    public String getEventDuration() {
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    // 現地時間（東京）の表示
    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    // UTC時間の表示
    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }

    public static void main(String[] args) {
        // 開始・終了日時（東京時間）
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime start = ZonedDateTime.of(2024, 7, 1, 10, 0, 0, 0, tokyo);
        ZonedDateTime end = ZonedDateTime.of(2024, 7, 15, 22, 0, 0, 0, tokyo);

        // イベントインスタンスを作成（ここで名前をセット！）
        Main4 event = new Main4("サマーフェスティバル", start, end);

        // 要件1：イベント名の表示（固定文字列ではなくインスタンスの中身を使う）
        System.out.println("イベント: " + event.getEventName());

        // 開始・終了日時の表示
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        System.out.println("開始: " + start.format(formatter));
        System.out.println("終了: " + end.format(formatter));

        // 開催期間の表示
        System.out.println("期間: " + event.getEventDuration());

        // 現地時間の表示（東京）
        System.out.println("現地時間: " + event.getLocalTime());

        // UTC時間の表示
        System.out.println("UTC時間: " + event.getUtcTime());
    }
}