package Day10;

import java.util.ArrayList;
import java.util.Arrays;

public class day10_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3},"right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for (int i = 0; i < numbers.length-1; i++) answer[i+1] = numbers[i];
        }
        else{
            for (int i = 0; i < answer.length-1; i++) answer[i] = numbers[i+1];
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}
