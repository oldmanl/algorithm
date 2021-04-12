package sorts;

/**
 * @author liuzhibin
 * Date: 2021/4/11
 */
public class QuickSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);

    }

    private <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int left = lo;
        int right = hi + 1;

        while (true) {
            while (SortUtils.less(a[++left], a[lo])) {
                if (left == hi) {
                    break;
                }
            }
            while (SortUtils.less(a[lo], a[--right])) {
                if (right == lo) {
                    break;
                }
            }

            if (left >= right) {
                break;
            }

            SortUtils.swap(a, left, right);
        }
        SortUtils.swap(a, lo, right);
        return right;
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new QuickSort().sort(a);
        SortUtils.print(a);
    }
}