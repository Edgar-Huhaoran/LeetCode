package questions.q290;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution s = new Solution();

        while (true) {
            System.out.println(s.wordPattern(in.nextLine(), in.nextLine()));
        }

    }

}

