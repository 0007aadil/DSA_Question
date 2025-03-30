public class maxProfitArray {
    
    public static int maxProfit(int arr[]) {
        if (arr.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i]; // Track the lowest price so far
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - minPrice); // Track max profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr)); // Output: 5
    }
}
