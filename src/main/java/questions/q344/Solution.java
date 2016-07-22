package questions.q344;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(solution.reverseString(in.next()));
        }
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char c;
        int length = chars.length;
        int times = length / 2;
        for (int i = 0; i < times; i++) {
            c = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = c;
        }
        return String.copyValueOf(chars);
    }
}
