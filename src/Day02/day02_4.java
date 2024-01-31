package Day02;

import java.util.Arrays;

public class day02_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }

    static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(x -> x*2).toArray();
    }
}
