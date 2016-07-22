package questions.q258;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println(s.addDigits(in.nextInt()));
        }
    }

}
