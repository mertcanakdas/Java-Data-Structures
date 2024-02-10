package datascructures;

public class Array {

    int[] array;
    int element;

    public Array(int size) {
        array = new int[size];
        element = 0;

    }

    public void add(int e) {
        if (element >= array.length) {
            System.out.println("Dizi dolu");
        } else {
            int i = 0;
            for (i = (element - 1); i >= 0 && array[i] > e; i--) {
                array[i + 1] = array[i];

            }
            System.out.println(i);
            array[i + 1] = e;
            element++;
        }
    }

    public int search(int e) {
        for (int i = 0; i < element; i++) {
            if (array[i] == e) {

                return i;
            }
        }
        return -1;
    }

    public void delete(int e) {
        int index = this.search(e);
        if (index == -1) {
            System.out.println("Dizide bu eleman yok");
        } else {
            array[index] = 0;
            System.out.println("Dizinin elamanı sıfırlandı");
        }
    }

    public void update(int old, int updated) {
        int index = this.search(old);
        delete(old);
        array[index] = updated;
        System.out.println("Dizi güncellendi");

    }

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        Array d = new Array(10);

        d.add(1);
        d.add(2);
        d.add(35);
        d.add(21);
        d.add(5);
        d.add(88);
        d.add(7);
        d.add(8);
        d.add(9);
        d.add(10);

        d.print();

    }

}
