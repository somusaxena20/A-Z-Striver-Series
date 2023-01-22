package basic_hashing;

import java.util.HashMap;

public class UnionOfTwoArray {

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])) {
                map.put(b[i], 1);
            }
        }

        return map.size();
        
    }

    public static void main(String[] args) {
        int []a = {85, 25, 1, 32, 54, 6};
        int []b = {85, 2};  
        
        System.out.println(doUnion(a, 6, b, 2));
    }
}
