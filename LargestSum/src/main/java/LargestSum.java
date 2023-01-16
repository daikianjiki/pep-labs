
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        //index of the value should be differnt then each other.
        //I can use nums.get(highestvalue1) and nums.get(highestvalue2)?
        //Add those two numbers and return them.
        //OR!!! Sort them so the last two numbers are the highest number. Add those two.
        Collections.sort(nums);
        int size = nums.size();
        int firstNum = nums.get(size - 1);
        int secondNum = nums.get(size - 2);
        return firstNum+secondNum;
    }
}