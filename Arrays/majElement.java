package Arrays;
public class majElement {
    

    public static int majorityElement(int[] nums) {
       int maxCount = 0;
       int majority = nums[0];

       for(int i=0 ; i<nums.length; i++){
        int count =0;
        for(int j =i+1; j<nums.length; j++){

            if(nums[i] == nums[j]){
                count++;
                
            }
        }

        if (count > maxCount) {
            maxCount = count;
            majority = nums[i];
        }
       }
       return majority;

    }


    public static void main(String[] args) {
        int arr[] = {4,5,4,5,4,5,4,4,4,};

        System.out.println(majorityElement(arr));


    }
}
