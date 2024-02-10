package Day12;

import java.util.Arrays;

public class day12_2 {
    public static void main(String[] args) {
        System.out.println(solution("hi12392"));
        System.out.println(solution("p2o4i8gj2"));
        System.out.println(solution("abcde0"));
    }

    static int[] solution(String my_string) {
        String numString = my_string.replaceAll("[a-z]","");
        int[] answer = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            answer[i] = numString.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
