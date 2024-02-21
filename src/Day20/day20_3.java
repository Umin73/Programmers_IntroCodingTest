package Day20;

import java.util.Arrays;

public class day20_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,-3,4,-5}));
        System.out.println(solution(new int[]{0,-31,24,10,1,9}));
        System.out.println(solution(new int[]{10,20,30,5,5,20,5}));
        System.out.println(solution(new int[]{6,4,3,2}));
    }

    static int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]* numbers[j] > answer)
                    answer = numbers[i]*numbers[j];
            }
        }

        return answer;
    }
}
