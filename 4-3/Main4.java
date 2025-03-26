import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main4 {
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    // コンストラクタ：イベント名・開始日時・終了日時を受け取って初期化
    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    // 要件3：イベント期間を「○日と○時間」で表示
    public String getEventDuration() {
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    // 要件4：現地時間（東京）の表示
    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    // 要件5：UTC時間の表示
    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }

    public static void main(String[] args) {
        // 要件1：イベント名の表示
        System.out.println("イベント: サマーフェスティバル");

        // 要件2：開始・終了日時の作成（東京時間）
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime start = ZonedDateTime.of(2024, 7, 1, 10, 0, 0, 0, tokyo);
        ZonedDateTime end = ZonedDateTime.of(2024, 7, 15, 22, 0, 0, 0, tokyo);

        // イベントインスタンスを作成
        Main4 event = new Main4("サマーフェスティバル", start, end);

        // 要件2：開始・終了日時の表示
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        System.out.println("開始: " + start.format(formatter));
        System.out.println("終了: " + end.format(formatter));

        // 要件3：開催期間の表示
        System.out.println("期間: " + event.getEventDuration());

        // 要件4：現地時間（東京）
        System.out.println("現地時間: " + event.getLocalTime());

        // 要件5：UTC時間
        System.out.println("UTC時間: " + event.getUtcTime());
    }
}