// 必要なインポート文を記載
import java.util.ArrayList;     // ArrayListを使うため
import java.util.Arrays;        // 配列をリストに変換するために使う
import java.util.HashSet;       // HashSetを使うため（重複を防ぐ）

public class Main4 {
    public static void main(String[] args) {
        // HashSet：発見したモンスターを記録（同じモンスターは1回だけ記録される）
        HashSet<String> discoveredMonsters = new HashSet<>();

        // ArrayList：戦ったモンスターを記録（何回戦ったか全部記録される）
        ArrayList<String> battleHistory = new ArrayList<>();

        // ArrayList：あらかじめ決められた全モンスターのリストを作る
        ArrayList<String> allMonsters = new ArrayList<>(
            Arrays.asList("スライム", "ドラゴン", "ゴブリン", "フェニックス", "ユニコーン")
        );

        // ===== モンスターとの戦闘履歴を記録しながら、発見したモンスターも追加する =====

        // スライムと5回戦った（ArrayListに5回追加）
        for (int i = 0; i < 5; i++) {
            battleHistory.add("スライム");         // 戦った履歴に追加（何度でもOK）
            discoveredMonsters.add("スライム");    // 発見リストにも追加（HashSetだから1回しか入らない）
        }

        // ドラゴンと2回戦った
        for (int i = 0; i < 2; i++) {
            battleHistory.add("ドラゴン");
            discoveredMonsters.add("ドラゴン");
        }

        // ゴブリンと2回戦った
        for (int i = 0; i < 2; i++) {
            battleHistory.add("ゴブリン");
            discoveredMonsters.add("ゴブリン");
        }

        // ===== 発見済みモンスターの表示 =====
        // HashSetの中身を表示（重複なしで自動的にユニークなリスト）
        System.out.println("発見済みモンスター: " + discoveredMonsters);

        // 発見済みモンスターの種類数を表示（HashSetのサイズ）
        System.out.println("発見済みモンスター数: " + discoveredMonsters.size());

        // ===== スライムと戦った回数をカウントする =====
        int slimeCount = 0; // スライムとの戦闘回数をカウントする変数

        // battleHistoryをすべて確認し、「スライム」が何回あるか数える
        for (String monster : battleHistory) {
            if (monster.equals("スライム")) {
                slimeCount++; // スライムが出てきたらカウントを増やす
            }
        }

        // スライムとの戦闘回数を表示
        System.out.println("スライムとの戦闘回数: " + slimeCount);

        // ===== 未発見のモンスターを調べる =====

        // allMonstersのコピーを作成（オリジナルを残すため）
        ArrayList<String> undiscoveredMonsters = new ArrayList<>(allMonsters);

        // 発見したモンスターは取り除く → 未発見だけが残る
        undiscoveredMonsters.removeAll(discoveredMonsters);

        // 未発見モンスターを表示
        System.out.println("未発見のモンスター: " + undiscoveredMonsters);
    }
}