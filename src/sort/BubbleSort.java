package sort;

public class BubbleSort {
    public static int[] sort(int[] elements) {
        int unsortedPartitionIndex = elements.length - 1;
        while (unsortedPartitionIndex > 0){
            for (int i = 0; i < unsortedPartitionIndex; i++){
                if(elements[i] > elements[i+1]){
                    int temp = elements[i+1];
                    elements[i+1] = elements[i];
                    elements[i] = temp;
                }
            }
            unsortedPartitionIndex--;
        }
        return elements;
    }
}
