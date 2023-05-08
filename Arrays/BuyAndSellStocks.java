package Arrays;

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int arr[]) {
        int maxProfit = 0;
        int bp = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (bp < arr[i]) {
                int profit = arr[i] - bp;
                if (profit > maxProfit) { // or use Math.max(profit,maxProfit)
                    maxProfit = profit;
                }
            } else {
                bp = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = buyAndSellStocks(prices);
        System.out.println("The maximum profit made is: " + profit);
    }
}
