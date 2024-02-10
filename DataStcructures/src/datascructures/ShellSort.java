package datascructures;

import java.util.Arrays;

public class ShellSort {

    public void shellSort(int[] d) {
        int i = 0, j = 0;
        int gap = 0;

        for (gap = d.length; gap > 0; gap /= 2) {
            for (i = gap; i < d.length; i += gap) {
                int tmp = d[i];
                for (j = i; j > 0 && d[j - gap] > tmp; j -= gap) {
                    d[j]=d[j-gap];
                }
                    d[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] d = {8, 6, 14, 22, 7, 16, 55, 2, 11, 63, 28, 32};
        ShellSort ss = new ShellSort();
        ss.shellSort(d);
        System.out.println(Arrays.toString(d));

    }
}
