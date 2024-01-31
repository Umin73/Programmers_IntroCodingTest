package Day03;

import java.util.ArrayList;

public class day03_4 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i+=2) {
            answer.add(i);
        }
        return answer;
    }
}
