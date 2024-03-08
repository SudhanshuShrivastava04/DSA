import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPermutations {
    public static void main(String[] args) {
        int n = 4;
        int k = 9;
        getPermutation(n,k);
    }

    public static void getPermutation(int n, int k){
        int[] arr = new int[n];
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        generate(arr, result);
        result.sort((list1, list2) -> list1.get(0).compareTo(list2.get(0)));
        System.out.println(result.get(k-1));
    }

    public static void generate(int[] arr, List<List<Integer>> result){
        backtrack(arr, new ArrayList<>(), result);
    }

    public static void backtrack(int[] arr, List<Integer> list, List<List<Integer>> result){
        if(list.size() == arr.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int n : arr){
            if(list.contains(n)) continue;
            list.add(n);
            backtrack(arr, list, result);
            list.remove(list.size() -1);
        }
    }


}
