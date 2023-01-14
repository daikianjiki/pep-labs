import java.util.ArrayList;
import java.util.List;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // List<Integer> arr3 = new ArrayList<>();
        int[] arr3 = {};
        int[] value = {};
        for (int i = 0; i < arr1.length; i++) {
            value[i] = arr1[i] + arr2[i];
            arr3 = new int[value[i]];
        }

        return arr3;
    }
}
