package datascructures;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    int[] array;

    public InsertionSort(int[] d) {
        this.array = d;

    }

    public void ınsertionSort() {
        int tmp = 0, i = 0, j = 0;
        for (i = 0; i < array.length; i++) {
            tmp = array[i];
            for (j = i;j>0 && array[j-1]>tmp; j--) {
                array[j] = array[j-1];
                
            }
            array[j]=tmp;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Random rn = new Random();
        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = rn.nextInt(100);

        }

        InsertionSort ıs = new InsertionSort(d);
        ıs.print();
        ıs.ınsertionSort();
        ıs.print();
    }
}
