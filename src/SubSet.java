import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        // unique elements array
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = subSetsUsingIteration(nums);
        System.out.println(ans);
        int[] arr = new int[]{4,4,4,1,4};
        List<List<Integer>> result = duplicateSubSetsUsingIteration(arr);
        System.out.println(result);
    }

    public static List<List<Integer>> subSetsUsingIteration(int[] nums){
        // through iteration
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static List<List<Integer>> duplicateSubSetsUsingIteration(int[] nums){
        // through iteration
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        int start = 0;
        int end = 0;
        outer.add(new ArrayList<>());
        for(int i = 0; i<nums.length; i++){
            start = 0;
            if(i>0 &&nums[i] == nums[i-1]){
                start = end +1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
