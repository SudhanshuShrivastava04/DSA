import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    // find pascals triangle till nth row
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 1; i <= numRows; i++) {
                list.add(sublist(i));
            }
            return list;
        }


        public static List<Integer> sublist(int n){
            List<Integer> list = new ArrayList<>();
            int res = 1;
            list.add(1);
            for (int i = 1; i < n; i++) {
                res = res * (n - i);
                res = res/i ;
                list.add(res);
            }
            return list;
        }
    }
}
