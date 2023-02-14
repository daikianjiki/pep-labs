import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        // int[] comArr = new int[arr3];
        // System.arraycopy(arr1, 0, comArr, 0, arr1.length);
        // System.arraycopy(arr2, 0, comArr, arr1.length, arr2.length);
        // return comArr;

        // a way I can combine array without needing to use arraycopy.
        int[] res = new int[len];
        for (int i = 0, j = 0; i < len; i++) {
            if (i < arr1.length) {
                res[i] = arr1[i];
            } else {
                res[i] = arr2[j];
                j++;
            }
        }
        return res;

    }
}
