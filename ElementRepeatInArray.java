public class ElementRepeatInArray {
    

    public static boolean ElRepeat(int arr[]){
       
       for(int i =0 ; i < arr.length -1; i++){
        for(int j =i+ 1 ; j<arr.length; j++){
            if (arr[j] == arr[i]) {
                return true;
            }
        }
    }
       return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,9,11,12,2};
        System.out.println(ElRepeat(arr));
    }
}
