package Day01;

import java.util.Arrays;

public class day01_4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    static double solution(int[] numbers) {
        return (double) Arrays.stream(numbers).sum()/ numbers.length;
    }
}
