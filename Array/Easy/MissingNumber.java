package Array.Easy;
// https://leetcode.com/problems/missing-number/
// https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number
public class MissingNumber {

    public static int missingNumber(int[] a) {
        
        int i = 0;

        while (i < a.length) {
            int ind = a[i];
            if (a[i] == a.length) {
                i++;
            }else if (a[i] != a[ind]) {
                int t = a[i];
                a[i] = a[ind];
                a[ind] = t;
            }    
            else{
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (j != a[j]) {
                return j;
            }
        }
        return a.length;
    }

    public static void main(String[] args) {
        int []a = {3,0,1};
        System.out.println(missingNumber(a));
    }
}
