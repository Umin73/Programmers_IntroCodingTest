package Day19;

import java.util.Arrays;

public class day19_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,3,4,5},1));
        System.out.println(solution(new int[]{0,2,3,4},1));
    }

    static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(a -> a==n).count();
    }
}
