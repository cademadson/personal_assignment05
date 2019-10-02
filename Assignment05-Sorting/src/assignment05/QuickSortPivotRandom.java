package assignment05;

import java.util.List;

/**
 * Implements in-place QuickSort using the {@code Sorter} interface by selecting
 * a random element in the list as the pivot.
 * 
 * This class must implement the {@code setThreshold, threshold} methods.
 * 
 * @author Swaroop Joshi
 *
 * @param <T> type of the element of the list this sorter can sort
 */
public class QuickSortPivotRandom<T extends Comparable<? super T>>
    extends AbstractQuickSort<T> {

  // TODO add constructor

  @Override
  protected T pivot(List<T> list, int start, int end) {
    assert list != null : "Violation of: list is not null";
    return null; // FIXME
  }

  // TODO Override other methods if required
  // TODO Add private helper methods as needed

}