// LeetCode Problem: 74. Search a 2D Matrix
// Problem link: https://leetcode.com/problems/search-a-2d-matrix/

public class SearchIn2DMatrix {

    /**
     * Searches for a target value in a 2D matrix.
     * The matrix has the properties that each row is sorted and the first integer of each row 
     * is greater than the last integer of the previous row.
     *
     * @param matrix The 2D matrix of integers
     * @param target The target integer to search for
     * @return true if target exists in matrix, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;          // number of rows
        int n = matrix[0].length;       // number of columns

        int l = 0, r = m * n - 1;       // search space in 1D flattened index

        while (l <= r) {
            int mid = l + (r - l) / 2;  

            // Get row and column from 1D index
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) 
                return true;
            else if (midElement < target) 
                l = mid + 1;
            else 
                r = mid - 1;
        }
        return false;
    }

    // Test cases
    public static void main(String[] args) {
        SearchA2DMatrix solution = new SearchA2DMatrix();

        int[][] matrix1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println(solution.searchMatrix(matrix1, 3));  // true
        System.out.println(solution.searchMatrix(matrix1, 13)); // false

        int[][] matrix2 = {
            {1}
        };
        System.out.println(solution.searchMatrix(matrix2, 1));  // true
        System.out.println(solution.searchMatrix(matrix2, 0));  // false

        int[][] matrix3 = {
            {1, 3}
        };
        System.out.println(solution.searchMatrix(matrix3, 3));  // true
        System.out.println(solution.searchMatrix(matrix3, 2));  // false
    }
}
