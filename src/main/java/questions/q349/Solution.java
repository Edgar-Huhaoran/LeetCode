package questions.q349;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultList = new LinkedList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                resultList.add(num);
                set.remove(num);
            }
        }

        int[] resultArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultArr[i] = num;
            i++;
        }
        return resultArr;
    }

}
