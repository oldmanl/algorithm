package sorts;

/**
 * @author liuzhibin
 * Date: 2021/4/10
 */
public interface SortAlgorithm {
    <T extends Comparable<T>> void sort(T[] a );
}
