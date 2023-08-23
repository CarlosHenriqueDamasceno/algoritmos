package search;

import java.util.List;

public class BinarySearch {
    public static int search(List<Integer> elements, int element) {
        int start = 0;
        int stop = elements.size() - 1;
        int middle = (start + stop) / 2;
        while (elements.get(middle) != element  && start < stop){
            if (element < elements.get(middle)){
                stop = middle - 1;
            }else {
                start = middle + 1;
            }
           middle = (start + stop) / 2;
        }
        return (elements.get(middle) != element) ? -1 : middle;
    }
}
