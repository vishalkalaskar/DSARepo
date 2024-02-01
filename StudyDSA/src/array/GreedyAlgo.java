package array;

public class GreedyAlgo {

    public static void coinChange(int[] coins, int targetAmount) {
        int remainingAmount = targetAmount;
        int coinCount = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (remainingAmount >= coins[i]) {
                System.out.println("Selected coin: " + coins[i]);
                remainingAmount -= coins[i];
                coinCount++;
            }
        }

        System.out.println("Total number of coins needed: " + coinCount);
    }

    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};
        int targetAmount = 63;

        System.out.println("Coin denominations: [25, 10, 5, 1]");
        System.out.println("Target amount: " + targetAmount);

        coinChange(coins, targetAmount);
    }
}

