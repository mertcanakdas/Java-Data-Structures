package datascructures;

import java.util.Arrays;

public class MergeShort {

    public void mergeShort(int[] d, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeShort(d, l, m);
            mergeShort(d, m + 1, r);
            merge(d, l, m, r);
        }
    }

    public void merge(int[] d, int l, int m, int r) {
        int i = l;
        int j = m + 1;

        int[] t = new int[(r - l) + 1];
        int k = 0;
        
        while(i<= m && j<= r){
            if(d[i] < d[j]){
                t[k] = d[i];
                i++;
            }else{
                t[k] = d[j];
                j++;
            }
            k++;
        }
        while(i <= m){
            t[k] = d[i];
            i++;
            k++;
        }
        while(j <= r){
            t[k] = d[j];
            j++;
            k++;
        }for(i = 0;i< t.length;i++){
            d[l++] = t[i];
        }
    }

    public static void main(String[] args) {
        MergeShort ms = new MergeShort();
        int[] d = {3, 2, 1, 6, 8, 7, 5, 4, 9};
        System.out.println(Arrays.toString(d));
        ms.mergeShort(d, 0, d.length - 1);
        System.out.println(Arrays.toString(d));
    }

}
