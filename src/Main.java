import search.LinearSearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> elements = List.of(1,2,3,4);
        System.out.println(LinearSearch.linearSearch(elements, 2));
    }
}