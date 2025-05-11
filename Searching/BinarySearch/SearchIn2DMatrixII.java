public class SearchIn2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        int len = matrix.length;

        while (r < len && c >= 0) {
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) c = c - 1;
            else r = r + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchIn2DMatrixII obj = new SearchIn2DMatrixII();

        int[][] matrix1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println(obj.searchMatrix(matrix1, 3)); // true
        System.out.println(obj.searchMatrix(matrix1, 13)); // false

        int[][] matrix2 = {
            {5, 6, 7},
            {10, 12, 14},
            {20, 22, 24}
        };
        System.out.println(obj.searchMatrix(matrix2, 10)); // true
        System.out.println(obj.searchMatrix(matrix2, 8));  // false

        int[][] matrix3 = {
            {1}
        };
        System.out.println(obj.searchMatrix(matrix3, 1));  // true
        System.out.println(obj.searchMatrix(matrix3, 0));  // false

        int[][] matrix4 = {
            {1, 4},
            {2, 5}
        };
        System.out.println(obj.searchMatrix(matrix4, 5));  // true
        System.out.println(obj.searchMatrix(matrix4, 3));  // false
    }
}
