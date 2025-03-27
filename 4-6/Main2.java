// 必要なインポート文を記載
import java.util.ArrayList; // ArrayListを使うための準備（ライブラリを読み込む）

public class Main2 {
    public static void main(String[] args) {

        // Integer型のArrayListを作成（点数を入れる箱）
        ArrayList<Integer> scores = new ArrayList<>();
        
        // 点数を追加（5人分のテストの点数）
        scores.add(85);  // 85点を追加
        scores.add(92);  // 92点を追加
        scores.add(78);  // 78点を追加
        scores.add(55);  // 55点を追加（←不合格）
        scores.add(43);  // 43点を追加（←不合格）

        // 点数リストを表示（ArrayListをそのまま出力すると中身が見える）
        System.out.println("点数リスト:" + scores);
        
        // 平均点を計算
        int total = 0; // 合計点を入れる変数を初期化（0からスタート）

        // 拡張for文で、リスト内のすべての点数を合計
        for(int score : scores) {
            total += score; // 合計に加算していく
        }

        // 平均点を求める（小数になるようにキャスト）
        double average = (double)total / scores.size();
        System.out.println("平均点:" + average); // 計算した平均点を表示

        // 最高点を取得
        int max = scores.get(0); // まずは最初の点数を仮の最高点にしておく

        // すべての点数を見ながら、より高い点数があれば更新
        for(int score : scores) {
            if(score > max) {
                max = score; // より高い点があれば max を更新
            }
        }

        // 最終的に残った max が最高点
        System.out.println("最高点" + max);

        // 不合格者数（60点以下）を計算
        int failCount = 0; // 不合格の人数をカウントするための変数

        // すべての点数を見て、60点以下ならカウントを1増やす
        for (int score : scores) {
            if(score <= 60) {
                failCount++; // 不合格者をカウント
            }
        }

        // カウントした不合格者数を表示
        System.out.println("不合格者数" + failCount);
    }
}