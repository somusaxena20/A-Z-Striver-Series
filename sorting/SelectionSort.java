package sorting;

import java.util.Arrays;

public class SelectionSort {

    static int  select(int a[], int i)
	{
        int ind = i;
        for (int j = i+1; j < a.length; j++) {
            if(a[ind] > a[j])
                ind = j;
        }
        return ind;
	}
	
	static void selectionSort(int a[], int n)
	{
	    for (int i = 0; i < a.length; i++) {
            int ind = select(a, i);

            int t = a[i];
            a[i] = a[ind];
            a[ind] = t;
        }
	}

    public static void main(String[] args) {
        int []a = {4, 1, 3, 9, 7};

        selectionSort(a, a.length);

        System.out.println(Arrays.toString(a));
    }
}
