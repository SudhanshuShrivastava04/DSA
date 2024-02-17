public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 3, 5, 2, 6, 1};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int profit = 0;
        int maxProfit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = price - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
