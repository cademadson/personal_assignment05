package sorterTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import assignment05.QuickSortNaive;

public class sorterTests {  

	@Test
	public void test() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(-52);
		testList.add(12);
		testList.add(1000);
		testList.add(0);
		testList.add(-12);
		testList.add(175);
		
		QuickSortNaive<Integer> quickSort = new QuickSortNaive<Integer>();
		quickSort.sort(testList);
		System.out.println(testList);
	}

}
