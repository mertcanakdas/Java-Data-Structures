package datascructures;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] d, int l, int r) {
        if (l < r) {
            int pi = partition(d, l, r);
            quickSort(d, 0, pi - 1);
            quickSort(d, pi + 1, r);

        }

    }

    public int partition(int[] d, int l, int r) {
        int pi = r;
        int i = l;
        int j = r;
        
        do {            
            while(d[i]<d[pi]) i++;
            while(d[j]>d[pi]) j--;
            if(i< j) swap(d, i, j);
            
        } while (i < j);
            swap(d, i, pi);
        
        
        return i;
    }

    public void swap(int[] d, int i, int j) {
        int tmp =d[i];
        
        d[i] = d[j];
        d[j] = tmp;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] d = {2, 45, 84, 6, 19, 11, 1, 3, 5, 35, 72};
        System.out.println(Arrays.toString(d));
        qs.quickSort(d, 0, d.length - 1);
        System.out.println(Arrays.toString(d));

    }

}
