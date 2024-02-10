package datascructures;

import java.util.Arrays;

public class RadixSort {

    public void radixSort(int[] d) {
        int max = findMax(d);
        for (int e = 1; (max / e) > 0; e *= 10) {
            countingSort(d, e);
        }
    }

    public int findMax(int[] d) {
        int max = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] > max) {
                max = d[i];
            }
        }

        return max;
    }

    public void countingSort(int []d, int e) {
        int n = d.length;
        int i =0;
        int[] t = new int[n];
        int[] c = new int[10];
        
        for(i = 0;i<n;i++){
            c[(d[i]/e)%10]++;
        }
        for(i =1;i<n;i++){
            c[i] += c[i-1];
        }
        for(i=n-1;i>=0;i--){
            t[--c[(d[i]/e)%10]] = d[i];
        }
        for(i=0;i<n;i++){
            d[i] = t[i];
        }
    }

    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        int[] d = {12, 54, 2, 7, 86, 96, 231, 34, 65, 345};
        System.out.println(Arrays.toString(d));
        rs.radixSort(d);
        System.out.println(Arrays.toString(d));
    }

}
