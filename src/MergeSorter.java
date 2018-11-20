import java.util.Arrays;

public class MergeSorter {
    public static void mergeSort(int[] elements){
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp){
        if(from < to){
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
    private static void merge(int[] elements, int from, int middle, int to, int[] temp){
        //int check = from;
        boolean done;
        temp = elements;

        int checked = from;
        for(int i = middle+1; i <= to; i++){ //From middle to the end
            done = false;
            for(int j = checked; j <= middle; j++) { //For each value from the start to the middle
                if (!done) {
                    if (elements[i] < elements[j]) { //If value is smaller than any value from the left half
                        temp[j] = temp[i];
                        checked = j;
                        for(int k = checked + 1; k <= i; k++) { //For all other values from the swap to the end of the array
                            temp[k] = elements[k - 1];
                        }
                        done = true;

                    }
                }
            }
        }
        System.out.println(Arrays.toString(elements));
        elements = temp;
        System.out.println(Arrays.toString(elements) + "\n");
    }
}
