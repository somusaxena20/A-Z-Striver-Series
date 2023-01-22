package basic_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] a, int target) {
        // Arrays.sort(a);
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i<a.length; i++)
        {
            if(h.containsKey(a[i]))
                return new int[]{h.get(a[i]),i};
            h.put(target-a[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int []a = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(a, 9)));
    }
}
