import java.util.Arrays;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        //I need to compare an arr with arr that is sorted. This way, I can tell if its sorted or not sorted. 
        boolean isSorted = false;
        int [] sortedArr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sortedArr[i]) {
                isSorted = true;
            }
        }
        return isSorted;
    }
}
