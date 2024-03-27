import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {
//    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//    Output: [[1,6],[8,10],[15,18]]
//    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6]

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currInterval = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(currInterval[1] >= intervals[i][0]){
                currInterval[1] = Math.max(currInterval[1],intervals[i][1]);
            } else {
                result.add(currInterval);
                currInterval = intervals[i];
            }
        }
        result.add(currInterval);
        int[][] resultIntervals = new int[result.size()][2];
        for(int i=0; i<resultIntervals.length; i++){
            resultIntervals[i] = result.get(i);
        }
        return resultIntervals;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
