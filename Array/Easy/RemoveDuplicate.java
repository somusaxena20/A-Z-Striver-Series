package Array.Easy;

public class RemoveDuplicate {
    // https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array
    static int remove_duplicate(int a[],int n){
        
        int cleanInd = 0;

        a[cleanInd++] = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                a[cleanInd++] = a[i];
            }
        }
        return cleanInd;
    }

    
    public static void main(String[] args) {
        int []a = {2, 2, 2, 2, 2};

        System.out.println(remove_duplicate(a, a.length));
    }
}
