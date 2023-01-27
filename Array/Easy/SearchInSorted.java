package Array.Easy;

// https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

public class SearchInSorted {

    // Linear Search
    static int searchInSorted(int a[], int n, int k)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    static int searchInSorted1(int a[], int n, int k)
    {
        int l = 0, h = n;
        while (l <= h) {
            int mid = l + (h-l)/2;

            if (a[mid] == k) {
                return 1;
            }
            else if (a[mid] < k) {
                l = mid+1;
            }
            else{
                h = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,6};
        System.out.println(searchInSorted1(a, a.length, 4));
    }
}
