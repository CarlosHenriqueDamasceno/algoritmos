package search;

import java.util.List;

public class LinearSearch {
    public static int linearSearch(List<Integer> elements, int x){
        int length = elements.size();
        for (int i = 0; i < length; i++){
            if(elements.get(i) == x){
                return i;
            }
        }
        return -1;
    }
}
