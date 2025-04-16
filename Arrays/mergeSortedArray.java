package Arrays;
import java.util.Arrays;

public class mergeSortedArray {
    public static void sortedArray(int arr1[], int m , int arr2[] , int n){
        int[] newArr = new int[m + n];

        // Copy arr1's valid elements
        for (int i = 0; i < m; i++) {
            newArr[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < n; i++) {
            newArr[m + i] = arr2[i];
        }

        // Insertion Sort to sort the combined array
        for (int i = 1; i < newArr.length; i++) {
            int curr = newArr[i];
            int j = i - 1;

            while (j >= 0 && newArr[j] > curr) {
                newArr[j + 1] = newArr[j];
                j--;
            }
            newArr[j + 1] = curr;
        }

        // Copy back to arr1
        for (int i = 0; i < m + n; i++) {
            arr1[i] = newArr[i];
        }

        System.out.println("Merged and sorted: " + Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int arr2[] = {2, 5, 6};
        int n = 3;

        sortedArray(arr1, m, arr2, n);
    }
}
