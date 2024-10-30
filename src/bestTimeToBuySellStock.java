public class bestTimeToBuySellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for(int i = 0 ; i <prices.length-1;i++){
            buy = Math.min(buy,prices[i]);
            sell = Math.max(sell,prices[i+1]-buy);
        }
        return sell;
    }
}
