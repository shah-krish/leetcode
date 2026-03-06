// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class bestTimetoBuySellStock {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int buy = prices[0];
        int sell = prices[1];
        int profit = 0;
        for(int i =0; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
                sell = 0;
            }
            else if(prices[i]>sell){
                sell = prices[i];
            }
            profit = Math.max(profit, sell-buy);
        }
        return profit;
    }
}
