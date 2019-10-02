package assignment05;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements in-place QuickSort using the {@code Sorter} interface by selecting
 * the first element in the list as the pivot.
 * 
 * This class must implement the {@code setThreshold, threshold} methods.
 * 
 * @author Andrew Call and Cade Madson
 *
 * @param <T> type of the element of the list this sorter can sort
 */
public class QuickSortPivotFirst<T extends Comparable<? super T>>
extends AbstractQuickSort<T> {

	public QuickSortPivotFirst() {
		this.name = "QuickSortPivotFirst";
		this.complexity = ComplexityClass.NLOGN;
	}

	/**
	 * 
	 */
	@Override
	protected T pivot(List<T> list, int start, int end) {
		assert list != null : "Violation of: list is not null";
		T pivot = list.get(0);
		int i = start;
		for(int j = end; j > start; j--) {
			if(list.get(j).compareTo(pivot) > 0) {
				SortUtils.swapElementsAt(list, i, j);
			}
			
		}
		return null; // FIXME
	}
	
	 @Override
	  public final void sort(List<T> list) {
		/*
		 * if (list.size() > 1) { T pivot = list.remove(0);
		 * 
		 * sort(front); sort(back);
		 * 
		 * list.addAll(front); list.add(pivot); list.addAll(back); }
		 */
	  }

	// TODO Override other methods if required
	// TODO Add private helper methods as needed

}
