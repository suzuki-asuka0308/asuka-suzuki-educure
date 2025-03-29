// 必要なクラス（ArrayList）を使うためのimport文
import java.util.ArrayList;

// パーティメンバーを表すクラス
public class PartyMember {

    // キャラクターの名前（文字列）
    private String name;

    // スキルの一覧（文字列を入れるリスト）
    private ArrayList<String> skills; 

    // コンストラクタ（キャラクターの名前を受け取って初期化する）
    public PartyMember(String name) {
        this.name = name; // 引数nameをフィールドに代入
        this.skills = new ArrayList<>(); // スキルリストを空で作る（初期化）
    }

    // スキルを1つ追加するメソッド
    public void addSkill(String skill) {
        skills.add(skill); // スキルリストに新しいスキルを追加
    }

    // キャラクターを深くコピーするメソッド（cloneのオーバーライドではなく、自作のclone）
    public PartyMember clone() {
        // 新しいPartyMemberインスタンスを作成し、名前をコピー
        PartyMember copy = new PartyMember(this.name);
        
        // 自分が持っているスキルを1つずつコピー先にも追加（深いコピー）
        for (String skill : this.skills) {
            copy.addSkill(skill);
        }
        
        // コピーされたキャラクターを返す
        return copy;
    }

    // キャラクター名とスキル一覧を表示するメソッド
    public void showSkills() {
        // 例）アリスのスキル: [ファイア, ブリザード]
        System.out.println(name + "のスキル: " + skills);
    }
}