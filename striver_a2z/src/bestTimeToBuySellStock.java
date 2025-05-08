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
/* solved may 7 '25
 public int maxProfit(int[] prices) {
        int max = 0;
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        for(int i =0; i< prices.length-1; i++){
            buyPrice = Math.min(buyPrice, prices[i]);
            max = Math.max(max, prices[i+1] - buyPrice);
        }
        return max;
    }
 */