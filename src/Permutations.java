import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        permutation(nums);
    }

    public static void permutation(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        generatePermutations(resultlist, nums);
        resultlist.sort((list1, list2) -> list1.get(0).compareTo(list2.get(0)));
        System.out.println(resultlist);
        System.out.println("Total number of permutations:" + resultlist.size());
    }

    public static void generatePermutations(List<List<Integer>> resultlist, int[] nums) {
        backtrack(resultlist, new ArrayList<>(), nums);
    }

    private static void backtrack(List<List<Integer>> resultlist, ArrayList<Integer> templist, int[] nums) {
        if (templist.size() == nums.length) {
            resultlist.add(new ArrayList<>(templist));
            return;
        }

        for (int number : nums) {
            if (templist.contains(number))
                continue;
            templist.add(number);
            backtrack(resultlist, templist, nums);
            templist.remove(templist.size() - 1);
        }
    }

}
