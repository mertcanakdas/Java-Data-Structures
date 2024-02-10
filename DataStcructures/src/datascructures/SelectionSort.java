package datascructures;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    int[] array;

    public SelectionSort(int[] d) {
        this.array = d;

    }

    public void selectionSort() {
        int min = 0;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }   
            }
             if (min != i) {
                    tmp = array[min];
                    array[min] = array[i];
                    array[i] = tmp;
            }
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

        SelectionSort ss = new SelectionSort(d);
        ss.print();
        ss.selectionSort();
        ss.print();
    }

}
