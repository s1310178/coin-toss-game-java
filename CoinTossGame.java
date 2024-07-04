import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ユーザーの名前を取得
        System.out.print("Who are you? \n> ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            boolean isHeads = random.nextBoolean();
            String result = isHeads ? "Heads" : "Tails";
            if (isHeads) {
                headsCount++;
            } else {
                tailsCount++;
            }
            System.out.println("Round " + i + ": " + result);
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        // 勝敗の表示
        if (headsCount > tailsCount) {
            System.out.println(userName + " won!");
        } else {
            System.out.println(userName + " lost!");
        }

        scanner.close();
    }
}
