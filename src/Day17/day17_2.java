package Day17;

import java.util.Arrays;

public class day17_2 {
    public static void main(String[] args) {
        System.out.println(solution(3,new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(solution(5,new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println(solution(12,new int[]{2, 100, 120, 600, 12, 12}));
    }

    static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(a -> a%n==0).toArray();
    }
}
