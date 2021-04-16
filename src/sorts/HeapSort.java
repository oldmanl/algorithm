package sorts;

/**
 * @author oldmanl
 * Date: 2021/4/16
 */
public class HeapSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i, a.length);
        }

        for (int i = a.length - 1; i > 0; i--) {
            SortUtils.swap(a, 0, i);
            heapify(a, 0, i);
        }
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private <T extends Comparable<T>> void heapify(T[] a, int i, int length) {
        int child;

        for (; leftChild(i) < length; i = child) {
            child = leftChild(i);

            // if left child less than right child
            if (child < length - 1 && SortUtils.less(a[child], a[child + 1])) {
                child++;
            }
            if (SortUtils.less(a[i], a[child])) {
                SortUtils.swap(a, i, child);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        new HeapSort().sort(a);
        SortUtils.print(a);
    }
}
