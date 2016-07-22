package questions.q283;

public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int len = nums.length;
        int i = 0, j = 0;
        while (j < len) {
            if (nums[j] != 0) {
                if (i != j) {
                    nums[i] = nums[j];
                }
                i++;
            }
            j++;
        }
        while (i < len) {
            nums[i] = 0;
            i++;
        }
    }

}
