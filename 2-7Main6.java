import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("現在の経験値を入力してください");
            int currentExperience = scanner.nextInt();
            
            double bonusExperience = currentExperience * 0.25;
            double increasedExperience = currentExperience + bonusExperience;
            
            System.out.println("ボーナス後の経験値:" + (int)increasedExperience);
        }

         }

      }
        