package datascructures;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    int[] array;

    public BubbleSort(int[] d) {
        this.array = d;

    }

    public void bubbleSort() {
        int tmp = 0;
        boolean isSwapped = true;
        for (int i = 0; i < array.length && isSwapped; i++) {
            isSwapped = false;
            for (int j = 0; j < (array.length - 1)-i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    isSwapped = true;

                }
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

        BubbleSort bs = new BubbleSort(d);
        bs.print();
        bs.bubbleSort();
        bs.print();
    }

}
