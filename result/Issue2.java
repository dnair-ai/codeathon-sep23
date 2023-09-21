package result;

public class Issue2 {
        public static int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) {
                return -1;
            }
            
            int minPrice = prices[0];
            int maxProfit = 0;
            
            for (int i = 1; i < prices.length; i++) {
                int currPrice = prices[i];
                int currProfit = currPrice - minPrice;
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
                if (currPrice < minPrice) {
                    minPrice = currPrice;
                }
            }
            
            return maxProfit > 0 ? maxProfit : -1;
        }
}
