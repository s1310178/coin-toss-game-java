import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ユーザーに名前の入力を求める
        System.out.print("Who are you? \n> ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        int headsCount = 0;
        int tailsCount = 0;

        // コイントスの模擬
        System.out.println("Tossing a coin...");
        for (int round = 1; round <= 3; round++) {
            boolean isHeads = random.nextBoolean();
            String result = isHeads ? "Heads" : "Tails";
            if (isHeads) {
                headsCount++;
            } else {
                tailsCount++;
            }
            System.out.println("Round " + round + ": " + result);
        }

        // 結果の表示
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        // 勝利メッセージの表示
        if (headsCount > tailsCount) {
            System.out.println(userName + " won!");
        } else if (tailsCount > headsCount) {
            System.out.println(userName + " lost!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
