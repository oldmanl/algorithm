package sorts;

/**
 * @author liuzhibin
 * Date: 2021/4/10
 */
public class ShellSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && SortUtils.less(a[j], a[j - h]); j = j - h) {
                    SortUtils.swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new ShellSort().sort(a);
        SortUtils.print(a);
    }
}
