package Array.Easy;

// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
public class LargestElementInArray {

    public static int largest(int arr[], int n)
    {
        int large = 0;

        for (int x : arr) {
            if(large < x)
                large = x;
        }
        return large;
    }

    public static void main(String[] args) {
        int []a = {1, 8, 7, 56, 90};

        System.out.println(largest(a, a.length));
    }
}
