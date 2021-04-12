package sorts;

/**
 * @author liuzhibin
 * Date: 2021/4/11
 */
public class MergeSort implements SortAlgorithm {

    private Comparable[] temp;

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        temp = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {

        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;


        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private <T extends Comparable<T>> void merge(T[] a, int lo, int mid, int hi) {
        int left = lo;
        int right = mid + 1;

        if (SortUtils.less(a[mid], a[right])) {
            return;
        }

        for (int i = lo; i <= hi; i++) {
            temp[i] = a[i];
        }

        for (int i = lo; i <= hi; i++) {
            if (left > mid) {
                a[i] = (T) temp[right++];
            } else if (right > hi) {
                a[i] = (T) temp[left++];
            } else if (SortUtils.less(temp[right], temp[left])) {
                a[i] = (T) temp[right++];
            } else {
                a[i] = (T) temp[left++];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new MergeSort().sort(a);
        SortUtils.print(a);
    }
}
