package Day05;

import java.util.Arrays;

public class day05_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }

    static int[] solution(int money) {
        int cnt = money/5500;
        int change = money%5500;

        return new int[]{cnt, change};
    }
}
