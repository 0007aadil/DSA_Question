package Arrays;

public class singleNumber {
    

    
        public static int sigNumber(int[] nums) {
            
           
            for(int i=0; i< nums.length; i++){
                int count = 0;
                for(int j=0; j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
    
               if(count <= 1){
                return nums[i];
               }
            }
            
            return -1;
        }
        
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,7,4,3,4, 1, };
        System.out.println(sigNumber(arr));
    }
}
