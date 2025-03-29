public class Monster {
   
    private String name;
    private int level;

    public Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        // 自分自身との比較なら無条件でtrue
        if (obj == this) return true;
        
        // nullとの比較なら無条件でfalse
        if (obj == null) return false;
        
        // 型が違うならfalse
        if (!(obj instanceof Monster)) return false;
        
        // 名前と価格を比較して結果を返す
        Monster other = (Monster)obj;
        return this.name.equals(other.name) && 
               this.level == other.level;
    }
}
