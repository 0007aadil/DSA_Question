public class FindMissingAndRepeatValue {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int n2 = n * n;

        // Step 1: Flatten the 2D grid into a 1D array
        int[] flatArray = new int[n2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[index++] = grid[i][j];
            }
        }

        // Step 2: Create a frequency array to count occurrences
        int[] freq = new int[n2 + 1]; // Index from 1 to n^2
        for (int num : flatArray) {
            freq[num]++;
        }

        // Step 3: Find the repeating and missing numbers
        int repeated = -1, missing = -1;
        for (int i = 1; i <= n2; i++) {
            if (freq[i] == 2) {
                repeated = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        // Step 4: Return the result
        return new int[] {repeated, missing};
    }
}

class Main {
    public static void main(String[] args) {
        FindMissingAndRepeatValue solution = new FindMissingAndRepeatValue();

        // Test Case 1
        int[][] grid1 = {
            {1, 3},
            {2, 2}
        };
        int[] result1 = solution.findMissingAndRepeatedValues(grid1);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]"); // [2, 4]

        // Test Case 2
        int[][] grid2 = {
            {9, 1, 7},
            {8, 9, 2},
            {3, 4, 6}
        };
        int[] result2 = solution.findMissingAndRepeatedValues(grid2);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]"); // [9, 5]
    }
}
