package questions.q202;

import java.util.HashSet;

public class Solution {

    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        while (true) {
            if (n == 1) {
                return true;
            }

            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = digitSquareSum(n);
        }
    }

    public int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }


}

