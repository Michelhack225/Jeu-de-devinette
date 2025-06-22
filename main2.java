import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static class GuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            int secretNumber = random.nextInt(100) + 1; // entre 1 et 100
            int attempts = 0;
            int maxAttempts = 10;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenue dans le jeu de devinettes !");
            System.out.println("Devine le nombre entre 1 et 100. Tu as 10 essais.");

            while (attempts < maxAttempts) {
                System.out.print("Essai " + (attempts + 1) + " : ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Bravo ! Tu as deviné le bon nombre en " + attempts + " essai(s) !");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Trop petit !");
                } else {
                    System.out.println("Trop grand !");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Tu as utilisé tous tes essais. Le nombre était : " + secretNumber);
                }
            }

            scanner.close();
        }
    }

}
