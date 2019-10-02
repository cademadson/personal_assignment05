package assignment05;

import java.util.List;

/**
 * Implements insertion sort using the {@code Sorter} interface.
 * 
 * This class does not implement the {@code setThreshold} method.
 * 
 * @author Andrew Call and Cade Madson
 *
 * @param <T> type of the element of the list this sorter can sort
 */
public class InsertionSort<T extends Comparable<? super T>>
    extends AbstractSorter<T> {

  public InsertionSort() {
	  this.name = "InsertionSort";
  }

  @Override
  public void sort(List<T> list) {
    assert list != null : "Violation of: list is not null";

    int j;
	for(int i = 1; i < list.size(); i++) {
		T key = list.get(i);
		j = i - 1;
		while (j >= 0 && list.get(j).compareTo(key) > 0) {
			list.add(j, list.get(j+1));
			list.remove(j+2);
			j--;
		}
	}
  }

  // TODO Override other methods if required
  // TODO Add private helper methods as needed

}
