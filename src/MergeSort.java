import java.util.Arrays;

public class MergeSort {

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

    private static void merge(int[] elts, int from, int middle, int to, int[] temp){
        int i = from;
        int j = middle + 1;
        int k = from;
        while(i <= middle && j <= to){
            if(elts[i] < elts[j]) {
                temp[k] = elts[i];
                i++;
            } else {
                temp[k] = elts[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            temp[k] = elts[i];
            i++;
            k++;
        }
        while(j <= to){
            temp[k] = elts[j];
            j++;
            k++;
        }
        for(int x = from; x <= to; x++){
            elts[x] = temp[x];
        }
        System.out.println(Arrays.toString(elts));
    }

}
