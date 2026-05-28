import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int target = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Number Guessing Game!");
        System.out.println("10 chances hain — 1 se 100 ke beech guess karo:");
        
        while (guess != target && attempts < 10) {
            guess = sc.nextInt();
            attempts++;
            
            if (guess > target) {
                System.out.println("Too High! " + (10 - attempts) + " chances bache!");
            } else if (guess < target) {
                System.out.println("Too Low! " + (10 - attempts) + " chances bache!");
            } else {
                System.out.println("Correct! " + attempts + " attempts mein guess kiya!");
            }
        }
        
        if (attempts == 10 && guess != target) {
            System.out.println("Game Over! Sahi number tha: " + target);
        }
        
        sc.close();
    }
}
