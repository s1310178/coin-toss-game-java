import java.util.Random;

public class CoinTossGame {
    public static void main(String[] args) {
        Random random = new Random();
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
    }
}
