package assignment05;

import java.util.List;

/**
 * Implementation of common methods for all quick-sort variants.
 * 
 * @author Andrew Call and Cade Madson
 *
 * @param <T> type of elements of the collection to be sorted
 */
public abstract class AbstractQuickSort<T extends Comparable<? super T>>
    extends AbstractSorter<T> {
  /**
   * Returns the pivot around which to quick-sort the list. This method may modify
   * the {@code list}, e.g., median of three will move smallest value to front of
   * the list.
   * 
   * @param list  the list to find the pivot in
   * @param start start-index of the sublist to consider
   * @param end   end-index of the sublist to consider
   * @return pivot for quick-sort
   * 
   * @requires start <= end
   * 
   * @modifies {@code list}
   */
  protected abstract T pivot(List<T> list, int start, int end);

  /**
   * Determines a pivot and partitions the {@code list} between {@code left} and
   * {@code right} such that all elements less than pivot are on its left and all
   * elements greater than pivot are to its right.
   * 
   * @param list  the list to be partitioned
   * @param left  start-index of the sublist to partition
   * @param right end-index of the sublist to partition
   * @return the location of the pivot in the resulting list
   * 
   * @modifies {@code list}
   */
  protected int partition(List<T> list, int left, int right) {
    assert list != null : "Violation of: list is not null";

    return 0; // FIXME
  }

  /**
   * Sorts the virtual {@code list} between indexes {@code left} and {@code right}
   * using the Quick-Sort algorithm.
   * 
   * @param list  the list to be sorted
   * @param left  start-index of the sublist to be sorted
   * @param right end-index of the sublist to be sorted
   * 
   * @modifies {@code list}
   */
  protected void quickSort(List<T> list, int left, int right) {
    assert list != null : "Violation of: list is not null";

    // FIXME
  }

  @Override
  public void sort(List<T> list) {
    assert list != null : "Violation of: list is not null";

    // FIXME

    // Note: this can be common to all quicksort implementations; if you want to
    // modify it for any particular implementation, override it in the derived class
  }

  // TODO Override other methods if required
  // TODO Add private helper methods as needed

}
