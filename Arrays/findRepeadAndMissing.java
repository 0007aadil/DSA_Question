package Arrays;

import java.util.Arrays;

public class findRepeadAndMissing {
    

    public static int[] matrix(int grid[][]){
        int n = grid.length;
        int size = n * n;
        int freq[] = new int[size +1];

        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                int num = grid[i][j];
                freq[num]++;
            }
        }

        int repeated = -1;
        int missing = -1 ;

        for(int i=1; i<=size ; i++){
            if (freq[i] ==2) {
                repeated = i;
            }

            if (freq[i] ==0 ) {
                missing = i;
            }
        }
        return new int[]{repeated, missing};

    }


    public static void main(String[] args) {
        int arr[][] = {{9,1,7}, {8,9,2},{3,4,6}};

        System.out.println(Arrays.toString(matrix(arr)));
    }
}
