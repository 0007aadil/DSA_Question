package Arrays;

public class buyAndSell {
    
        public static int maxProfit(int[] prices) {
            int buyPrice = Integer.MAX_VALUE;
            int maxPro = 0;
    
            for(int i =0 ; i< prices.length; i++){
                if(prices[i] > buyPrice){
                    int profit = prices[i] - buyPrice;
                    maxPro = Math.max(maxPro, profit);
                }else {
                    buyPrice = prices[i];
                }
            }
            return maxPro;
        }
    

        public static void main(String[] args) {
            int arr[] = {7,1,5,3,6,4};
            System.out.println(maxProfit(arr));

        }
}
