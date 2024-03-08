import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetUsingRecursion {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int[] arr = new int[]{1,2,2};
        List<List<Integer>> ans = subset(nums);
        List<List<Integer>> Ans = subsetWithDuplicates(arr);
        System.out.println(ans);
        System.out.println(Ans);
    }

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        generateSubSets(nums,0,new ArrayList<>(), result);
        return result;
    }
    public static List<List<Integer>> subsetWithDuplicates(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generateSubSets(nums,0,new ArrayList<>(), result);
        return result;
    }

    public static void generateSubSets(int[] nums, int index, List<Integer> current,List<List<Integer>> result ){
        result.add(new ArrayList<>(current));

        for(int i = index; i<nums.length; i++){
            //skip duplicate
            if(i>0 && nums[i] == nums[i-1]) continue;

            current.add(nums[i]);
            generateSubSets(nums,i+1,current,result);
            current.remove(current.size() - 1);
        }
    }


}
