package sorts;

/**
 * @author liuzhibin
 * Date: 2021/4/10
 */
public class InsertionSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && SortUtils.less(a[j], a[j - 1]); j--) {
                SortUtils.swap(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new InsertionSort().sort(a);
        SortUtils.print(a);
    }
}
