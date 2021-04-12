package sorts;

public class SelectionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (SortUtils.less(a[j], a[min])) {
                    min = j;
                }
            }
            if (min != i) {
                SortUtils.swap(a, i, min);
            }
        }
    }


    public static void main(String[] args) {
        Integer[] a = {13, 49, 8, 15, 14, 48, 6, 97, 56, 23};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
        SortUtils.print(a);
    }

}

