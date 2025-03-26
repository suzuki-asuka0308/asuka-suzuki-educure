public class Main3 {

    // ユーザー名のバリデーション（条件を満たしているかチェック）
    public static boolean validateUsername(String username) {
        // 条件①：4〜16文字、英数字とアンダースコアのみ使用可
        if (!username.matches("^[a-zA-Z0-9_]{4,16}$")) {
            return false;  // 不正な文字が含まれている、または長さがNG
        }

        // 条件②：数字だけの名前は無効
        if (username.matches("^[0-9]+$")) {
            return false;  // 数字だけ
        }

        return true;  // すべての条件を満たす
    }

    // パスワードのバリデーション（条件を満たしているかチェック）
    public static boolean validatePassword(String password) {
        // 条件①：8文字以上かどうか
        if (password.length() < 8) {
            return false;
        }

        // 条件②：1つ以上の大文字を含んでいるか
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // 条件③：1つ以上の数字を含んでいるか
        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        return true;  // すべての条件を満たす
    }

    public static void main(String[] args) {
        // ユーザー名のテストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};

        System.out.println("ユーザー名チェック:");
        for (String name : usernames) {
            if (validateUsername(name)) {
                System.out.println(name + ": 有効");  // 条件を満たす
            } else {
                System.out.println(name + ": 無効");  // 条件を満たさない
            }
        }

        // パスワードのテストケース
        String[] passwords = {"Password123", "password123", "Pass"};

        System.out.println("パスワードチェック:");
        for (String pass : passwords) {
            if (validatePassword(pass)) {
                System.out.println(pass + ": 有効");  // 条件を満たす
            } else {
                System.out.println(pass + ": 無効");  // 条件を満たさない
            }
        }
    }
}

/*要件番号
内容
要件1-1
ユーザー名は 4〜16文字、英数字・アンダースコアのみ使用可
要件1-2
ユーザー名が数字だけなら無効
要件2-1
パスワードは8文字以上
要件2-2
パスワードに1文字以上の大文字が必要
要件2-3
パスワードに1文字以上の数字が必要
要件3
指定されたユーザー名・パスワードを検証する処理
要件4
結果を「有効／無効」で表示する
 */