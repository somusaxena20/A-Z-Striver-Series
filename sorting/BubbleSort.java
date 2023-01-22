package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        
        int []a = {20, 10, 30, 50, 40};

        System.out.println(Arrays.toString(bubbleSort(a)));

    }

    
}
