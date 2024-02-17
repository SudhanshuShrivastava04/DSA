import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        List<List<Integer>> resultList = new ArrayList<>();
        int row = 0;
        while (row < matrix.length) {
            List<Integer> list = new ArrayList<>();
            for (int[] ints : matrix) {
                list.add(ints[row]);
            }
            resultList.add(reverse(list));
            row++;
        }
        int[][] arr = resultList.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(arr[i], 0, matrix[i], 0, matrix[i].length);
        }
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
