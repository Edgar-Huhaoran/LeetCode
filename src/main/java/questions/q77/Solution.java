package questions.q77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combines = new LinkedList<List<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();
        generateCombine(combines, stack, 1, n, k);
        return combines;
    }

    public void generateCombine(List<List<Integer>> combines, Stack<Integer> stack,
                                int from, int to, int k) {
        for (int i = from; i <= to - k + 1; i++) {
            stack.add(i);
            if (k == 1) {
                combines.add(new ArrayList<Integer>(stack));
            } else {
                generateCombine(combines, stack, i + 1, to, k - 1);
            }
            stack.pop();
        }
    }

}
