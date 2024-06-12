import java.util.Arrays;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int left = 0, right = 1;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                maxProfit = prices[right] - prices[left] > maxProfit ? prices[right] - prices[left] : maxProfit;
                right++;
            }
        }
        return maxProfit;
    }
    public static int maxProfit(int[] prices, int n) {
        if (prices == null || prices.length == 0) return 0;

        int[] dp = new int[n]; // DP array to store the maximum profit up to each day
        int minPrice = prices[0]; // Initialize minPrice to the first day's price
    
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]); // Update minPrice
            dp[i] = Math.max(dp[i-1], prices[i] - minPrice); // Update DP array
        }

        System.out.println(Arrays.toString(dp));
        return dp[n-1]; // The last element of DP array is the maximum profit
    }
    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices, prices.length));
    }
}
