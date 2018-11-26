import java.util.Arrays;

public class Runner {

    public static void main(String[] args){
        int[] elements = randomIntArray(20);
        System.out.println("Starting Array: " + Arrays.toString(elements));
        MergeSort.mergeSort(elements);
        System.out.println("Finishing Array: " + Arrays.toString(elements));
    }

    public static int[] randomIntArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*1000);
        }
        return arr;
    }
}
