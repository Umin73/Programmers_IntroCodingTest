package Day25;

import java.util.Arrays;

public class day25_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,12)));
        System.out.println(Arrays.toString(solution(5,15)));
        System.out.println(Arrays.toString(solution(4,14)));
        System.out.println(Arrays.toString(solution(5,5)));
    }

    static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleNum = total/num;
        int idx = 0;
        int gap = 1;

        answer[idx++] = middleNum;

        while (idx < num) {
            answer[idx++] = answer[0]+gap;
            if(idx == num) break;
            answer[idx++] = answer[0]-gap;
            gap++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
