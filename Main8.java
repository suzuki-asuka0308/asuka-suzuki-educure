
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
     
        try (   Scanner scanner = new Scanner(System.in)) {
        
            System.out.println("攻撃力を入力してください:");
            int attackpower = scanner.nextInt();  
        
            System.out.println("防御力を入力してください：");
            int defensepower = scanner.nextInt();  
       
            int normalDamage = attackpower - defensepower;
           
            double criticalDamage = normalDamage * 1.5;
           
            int criticalDamageInt = (int) criticalDamage;
       
            System.out.println("通常ダメージ: " + normalDamage);
            System.out.println("クリティカルダメージ: " + criticalDamageInt);
         
        }
    }
}