public class SearchIn2DArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Time complexity = O(log(m*n))
        //
        int row = 0;
        int col = matrix[row].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        boolean ans = searchMatrix(matrix,5);
        System.out.println(ans);
    }
}
