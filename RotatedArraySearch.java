public class RotatedArraySearch {
    

    

    public static int findPivot(int arr[]){
        for(int i =0 ; i < arr.length -1 ; i++){
            if (arr[i+1] < arr[i]) {
                return i+1;
            }
        }
        return 0;
    }

    public static int binSearch(int arr[] ,int key){
        int n = arr.length;
        int pivot = findPivot(arr);
        int start ,end ;

        if (key >= arr[pivot]  && key <= arr[n-1])  {
            start = pivot;
            end = n-1;
            
        }else {
            start = 0;
            end = pivot -1 ;
        }


        while (start <= end) {
            int mid = (start + end ) / 2;

            if (arr[mid] ==  key) { 
                return mid;
            }
            if (arr[mid] < key) {
                start = mid+1;
            }else {
                end = mid -1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 3;
        System.out.println(binSearch(arr, key));

    }
}
