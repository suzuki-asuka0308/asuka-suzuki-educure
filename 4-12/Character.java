public class Character implements Comparable<Character> {

    private  String name;
    private  int hp;
    private  int attackpower;

    public Character(String name, int hp, int attackpower){
       this.name = name;
       this.hp = hp;
       this.attackpower = attackpower;

    }

    public int getBattlePower() {
        // ここで hp と attackpower を足して返す
        return hp + attackpower;
    }

    @Override
    public  int compareTo(Character other) {
        return other.getBattlePower()-this.getBattlePower();

    }

    
    @Override
    public String toString() {
        return name + " (HP:" + hp + " 攻撃力:" + attackpower + ") 戦闘力:" + getBattlePower();
    }
        
    

    
}
