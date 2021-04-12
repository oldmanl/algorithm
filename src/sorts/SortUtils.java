package sorts;


import java.util.Arrays;

public class SortUtils {
    public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];

        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <T> void print(T[] arr) {

        System.out.println(Arrays.toString(arr));
    }

    static <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }
}