package assignment05;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the merge sort using the {@code Sorter} interface.
 * 
 * This class must implement the {@code setThreshold, threshold} methods.
 * 
 * @author Andrew Call and Cade Madson
 * 
 * @param <T> type of the element of the list this sorter can sort
 */
public class MergeSort<T extends Comparable<? super T>>
    extends AbstractSorter<T> {

  // TODO add constructor
	public MergeSort() {
		this.name = "MergeSort";
		this.complexity = ComplexityClass.NLOGN;
	}

  @Override
  public void sort(List<T> list) {
    assert list != null : "Violation of: list is not null";
    
    mergeSort(list);
    
  }
  
  private List<T> mergeSort(List<T> list){
	  if(list.size() <= 1) {
	    	return list;
	    }

	    List<T> right = new ArrayList<T>();
	    List<T> left = new ArrayList<T>();
	    
	    for(int i = 0; i < list.size(); i++) {
	    	if(i < list.size() / 2) {
	    		right.add(list.get(i));
	    	}
	    	else {
	    		left.add(list.get(i));
	    	}
	    }
	    
	    left = mergeSort(left);
	    right = mergeSort(right);
	    
	    return merge(left, right);
	    
  }
  
  private List<T> merge(List<T> left, List<T> right) {
	  List<T> result = new ArrayList<T>();
	  int first = 0;
	  while(!left.isEmpty() && !right.isEmpty()) {
		  if(left.get(first).compareTo(right.get(first)) > 0) {
			  result.add(left.get(first));
			  left.remove(first);
		  }
		  else {
			  result.add(right.get(first));
			  right.remove(first);
		  }
	  }
	  
	  while(!left.isEmpty()) {
		  result.add(left.get(first));
		  left.remove(first);
	  }
	  while(!right.isEmpty()) {
		  result.add(right.get(first));
		  right.remove(first);
	  }
	  
	  return result;
  }

}
