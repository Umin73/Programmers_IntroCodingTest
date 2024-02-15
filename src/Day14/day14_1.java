package Day14;

import java.util.Arrays;

public class day14_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,10,28},20));
        System.out.println(solution(new int[]{10,11,12},13));
        System.out.println(solution(new int[]{2,3,4},1));
    }

    static int solution(int[] array, int n) {
        int gap = 101;
        int closeNum = 0;
        Arrays.sort(array);

        for (int a:array) {
            if(Math.abs(n-a) < gap){
                gap = Math.abs(n-a);
                closeNum = a;
            }
        }
        return closeNum;
    }
}
