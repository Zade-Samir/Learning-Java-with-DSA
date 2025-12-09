package Arrays;

public class BuyAndSellStocks {
    
    public static int findProfit(int prices[]) {
        int maxProfit = 0; //for profit 
        int buyPrice = Integer.MAX_VALUE; //for buying the current stock if required 

        for (int i = 0; i < prices.length; i++) {
            //if BP < SP(today's price)
            if (buyPrice < prices[i]) { //max < small at first
                int profit = prices[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i]; //todays price as selling price
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(findProfit(prices));
    }
}
