import java.util.Scanner;

public class MajorityElement {

    
        public static int majorityElement(int[] nums) {
            int n = nums.length;
    
            for (int i = 0; i < n; i++) {
                int count = 0;
    
                // Count occurrences of nums[i]
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
    
                // Check if it's the majority element
                if (count > n / 2) {
                    return nums[i];
                }
            }
    
            return -1; // This line will never be reached as the majority element is guaranteed
        }
    
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(majorityElement(nums));
    }
}
