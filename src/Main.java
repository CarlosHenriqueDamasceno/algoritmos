import search.BinarySearch;
import search.LinearSearch;
import sort.BubbleSort;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Search
        List<Integer> sortedArray = List.of(1,2,3,4,5);
        System.out.println(LinearSearch.linearSearch(sortedArray, 2));
        System.out.println(BinarySearch.search(sortedArray, 6));

        //Sort
        int[] unsortedArray = {1,8,-1,6,5};
        int[] result = BubbleSort.sort(unsortedArray);
        for (int element : result) {
            System.out.println(element);
        }
    }
}