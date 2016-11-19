/**
 * 
 */

/**
 * @author mclark17
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] test = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(BinarySearch.searchSortedArray(test, -1));
		System.out.println(BinarySearch.recursiveSearchSortedArray(test, -1));
	}
	
	public static int searchSortedArray(int[] search, int key) {
		int minIndex = 0;
		int maxIndex = search[search.length-1];
		while(maxIndex >= minIndex && minIndex <= search.length-1) {
			int midIndex = (maxIndex + minIndex) / 2;
			if(key == search[midIndex]) {
				return midIndex;
			} else if(key > search[midIndex]) {
				minIndex = midIndex + 1;
			} else {
				maxIndex = midIndex - 1;
			}
		}
		
		return -1;
	}
	
	public static int recursiveSearchSortedArray(int[] search, int key) {
		return BinarySearch.recursiveSearchSortedArray(search, key, 0, search.length-1);
	}
	
	public static int recursiveSearchSortedArray(int[] search, int key, int min, int max) {
		int middle = (min + max)/2;
		if(max < min || min <= search.length-1) {
			return -1;
		}
		
		if(key == search[middle]) {
			return middle;
		} else if(key > search[middle]) {
			return BinarySearch.recursiveSearchSortedArray(search, key, middle++, max);
		} else {
			return BinarySearch.recursiveSearchSortedArray(search, key, min, middle--);
		}
	}

}
