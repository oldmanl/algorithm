package sorts;

/**
 * @author oldmanl
 * Date: 2021/4/20
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        boolean flag;
        for (int i = 0; i < a.length; i++) {
            flag = false;
            for (int j = 0; j < a.length - i -1; j++) {
                if (SortUtils.less(a[j + 1], a[j])) {
                    flag = true;
                    SortUtils.swap(a, j + 1, j);
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new BubbleSort().sort(a);
        SortUtils.print(a);
    }
}
