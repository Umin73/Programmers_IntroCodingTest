package Day15;

import java.util.ArrayList;

public class day15_4 {
    public static void main(String[] args) {
        System.out.println(solution(24));
        System.out.println(solution(29));
    }

    static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            if(n%i == 0) answer.add(i);
        }

        return answer;
    }
}
