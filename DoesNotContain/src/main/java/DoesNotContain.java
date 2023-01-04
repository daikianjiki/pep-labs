
public class DoesNotContain {
    /**
     * The inverse of the contains value challenge: check if the array does *not* contain the value.
     * Note that this is not as simple as flipping the return true/false from the 'Contains' challenge.
     * You should think critically about the logic that you write within the for loop.
     *
     * For a trickier problem like this, you could even try explaining your thought process of working
     * through this problem with pencil and paper in plain English before attempting it in code.
     *
     * @param arr the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target. false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target){
        boolean n = true;
        for (int i = 0; i < arr.length; i++) {
            /*
             * I use the for loop so I can get arr[i]. If arr[i] != target, then it should come out true.
             * If arr[i] = {1, 2, 3, 4, 5} it returns true at arr[0] if target = 5
             * so the code ends before arr[4]? I need to write a code that continues to check throughout the each index..?
             */
            if (arr[i] == target) {
                n = false;
            } 
        } return n;
    }
}
