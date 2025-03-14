import java.util.Scanner;

public class Main1 {
    // 単語と日本語訳を保存する配列
    static String[] words = new String[20];
    // 英語の入力を受け付ける
    // 最大20個まで英単語を保存できるように
    static String[] translations = new String[20];
    // 日本語訳の入力を受け付ける
    static int wordCount = 0;  // 英単語は整数だからint 
    /* 初期化しないと最初はなにも設定されていない状態になる
       後でwordCountを使う時に予期しない動作が起こるから */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* System.inは単なる入力ソース
           ユーザーがキーボードから入力を始めると
           データはSystem.inを通じて受け取る */
        int menuChoice;

        while (true) {
            System.out.println("1:単語を登録する");
            System.out.println("2:クイズを受ける");
            System.out.println("3:終了する");

            System.out.print("選択肢を入力してください");
            menuChoice = getValidMenuChoice(scanner);
            //scanner.nextInt();からgetValidMenuChoice(scanner)に変更;
            /*scanner.nextInt() で取得した入力が 1, 2, 3 のいずれかでない場合、
            エラーメッセージが表示されます*/
            /*無効な入力に対する適切なエラーチェックと再入力を促す仕組みを追加するためです。
            これにより、ユーザーが誤った入力をした場合でもプログラムが適切に動作し、
            ユーザーエクスペリエンスが向上します */

            //scanner.nextLine();  // 改行を消すための処理

            if(menuChoice == 1) {
                System.out.println("単語登録画面が表示されました。");
                registerWord(scanner);  // 単語登録メソッドを呼び出す
            } else if(menuChoice == 2) {
                System.out.println("クイズ画面に移動します。");
                quiz(scanner); // クイズメソッドを呼び出す
            } else if(menuChoice == 3) {
                System.out.println("プログラムを終了します。");
                break;
            } else {
                System.out.println("無効な選択肢です。");
            }
        }

        scanner.close();
    }

    // メニュー選択の入力チェック
    public static int getValidMenuChoice(Scanner scanner) {
        int menuChoice = 0;
        /*最初に menuChoice という変数を 0 に初期化します。
        後でこの変数にユーザーが入力した数値を代入します */
        while (true) {
            //無限ループを使って、ユーザーが正しい入力をするまで繰り返し入力を求めます
            try {
                menuChoice = scanner.nextInt();
                /*ユーザーから整数を入力として受け取ります。
                例えば、1, 2, 3などの数値を期待しています。 */
                scanner.nextLine();  // 改行を消すための処理
                /*nextInt() は整数を入力後にそのまま Enter キーを押すことで改行が残ります。
                この改行を消すために nextLine() を呼び出します。これがないと次に文字列入力を
                受ける時に改行が残っていて意図しない挙動になる場合があります。 */
                if (menuChoice < 1 || menuChoice > 3) {
                    /*ユーザーが選んだメニューが 1, 2, 3 のいずれかでない場合に、
                    無効な選択肢としてエラーメッセージを表示します。
                    例えば、4 や -1 といった数値が入力された場合に「無効な選択肢です。」
                    というメッセージを表示します。 */
                    System.out.println("無効な選択肢です。1, 2, 3 のいずれかを選んでください。");
                } else {
                    return menuChoice;  // 有効な選択肢なら終了
                    /*ユーザーが正しい選択肢（1, 2, 3）を入力した場合、menuChoice の値を返してメソッドを終了します。
                    これにより、選択した番号が main メソッドに戻ります。 */
                }
            } catch (Exception e) {
                //ユーザーが無効な入力（例えば、文字や記号など）をした場合、この catch ブロックが実行されます。
                scanner.nextLine();  // 無効な入力を消去
                /*nextInt() は整数以外を入力すると例外（InputMismatchException）を発生させます。
                この例外をキャッチして、エラーメッセージを表示します。 */
                /*無効な入力を処理した後、入力バッファに残った無効なデータを削除するために nextLine() を呼び出します。
                これによって次回の入力がスムーズに行われます */
                System.out.println("無効な入力です。1, 2, 3 のいずれかを選んでください。");
            }
        }
    }

    // 単語登録処理
    public static void registerWord(Scanner scanner) {
        if(wordCount >= 20) {
            System.out.println("単語数が最大20個に達しました。");
            return;  // メソッドからの戻り。それ以降のコードは実施されません
        }
        String word = "";
        while (word.isEmpty()) {
            /*ユーザーが英単語で空で入力した場合に再度入力を求める処理を追加しました
            同様に日本語訳の入力も空でないかをチェックし、空なら再入力を促すようにしています。*/
            System.out.print("英単語を入力してください:");
            word = scanner.nextLine(); // ユーザーが入力した1行の文字列を取得
            // String wordは文字列を扱い格納するための変数
            // scanner.nextLine()はユーザーが入力した1行の文字列を取得します。
            if (word.isEmpty()) {
                //word が空かどうかを if (word.isEmpty()) で確認しています。
                System.out.println("英語を入力してください:");
                /*2回目の英語を入力してくださいはユーザーが何も入力しなかった場合
                再度「英単語を入力してください」と表示して再入力を促しています*/
            }
        }

        String translation = "";
        while (translation.isEmpty()) {
            System.out.print("日本語訳を入力してください:");
            translation = scanner.nextLine();
            if(translation.isEmpty()) {
                System.out.println("日本語を入力してください。");
            }
        }
        
        words[wordCount] = word;
        // words 配列の wordCount 番目の場所に word を保存する
        // words 英単語を保存するために使用する配列
        // wordCount 現在登録されている単語数を管理するための変数
        // word　ユーザーが入力した1つの英単語を保持している変数

        translations[wordCount] = translation;
        // translations 配列の wordCount 番目の場所に translation を保存する
        wordCount++;  // この行はwordCountを1増やすという意味
        // 現在登録されている単語数を管理する変数

        System.out.println("単語が登録されました！");
    }

    // クイズ機能
    public static void quiz(Scanner scanner) {
        if(wordCount == 0) {
            // 登録された単語が1つもない場合にクイズを実施しない
            System.out.println("登録された単語がありません。");
            return;
        }

        int correctAnswers = 0;
        /* クイズ中に正解した回数を数えるための変数
           最初は0に設定されており、ユーザーが正解するたびにカウントが1増える */
        
        for(int i = 0; i < wordCount; i++) {
            // wordCount 回数だけループを回すためのコード
            /* ループカウンタで、最初は0から始まり、wordCount より小さい間
               （つまり単語が登録されている間）繰り返し処理を行います。 */
            /* 登録された単語の数なので、例えば5個の単語が登録されていれば、
               i は0から4までの値を取ります。 */
            System.out.println("単語:" + words[i]);
            String answer = "";
            while (answer.isEmpty()) {
                System.out.print("訳を入力してください: ");
                answer = scanner.nextLine();
                if (answer.isEmpty()) {
                    System.out.println("訳を入力してください: ");
                }
            }
            
            if(answer.equals(translations[i])) {
                // 答えが正しいかを確認するために使われる
                /* equals は Stringクラスのメソッド で、
                   文字列が等しいかどうかを比較するために使う */
                /* [i] は配列のインデックスを表しています。
                   この i は、クイズを実施する際に、登録された単語と
                   その訳を順番に取り出すための番号 */
                System.out.println("正解です！"); 
                correctAnswers++; // 正解したら正解数を1増やす
                /* ユーザーが正解するたびに、その数を増やしていく
                   ++ 演算子を使うことで、コードが簡潔でわかりやすくなる */
                // correctAnswers++ は、正解数を1つ増やすための命令
            } else {
                System.out.println("不正解です。正しい答えは: " + translations[i]);
                /* translations[i] は、i 番目の問題に対する正しい答え（日本語訳）を取り出して、
                   画面に表示しています */
            }
        }
   
        // クイズ終了後の正解数を表示
        // correctAnswers：クイズの問題でユーザーが正解した回数を記録する変数です。
        // wordCount：登録された単語の総数を記録する変数です。
        // 正解数◯/◯になるように/を使う
        System.out.println("クイズ終了！ 正解数: " + correctAnswers + "/" + wordCount);
    }
}