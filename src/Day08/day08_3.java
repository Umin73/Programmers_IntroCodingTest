package Day08;

import java.util.*;

public class day08_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    static int[] solution(int[] emergency) {
        List<Integer> values = new ArrayList<>();
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            values.add(emergency[i]);
        }
        Collections.sort(values, Collections.reverseOrder());

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(values.get(i) == emergency[j]) answer[j] = i+1;
            }
        }

        return answer;
    }
}
