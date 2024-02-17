package Day17;

import java.util.Arrays;

public class day17_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71",
                "5 - 15 = 63", "3 - 1 = 2"})));
    }

    static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;

        for (String s:quiz) {
            String[] calc = s.split(" ");

            int n1 = Integer.parseInt(calc[0]);
            int n2 = Integer.parseInt(calc[2]);
            int n3 = Integer.parseInt(calc[4]);

            if(calc[1].equals("+")){
                if(n1+n2 == n3)
                    answer[idx] = "O";
                else
                    answer[idx] = "X";
            }
            else if(calc[1].equals("-")){
                if(n1-n2 == n3)
                    answer[idx] = "O";
                else
                    answer[idx] = "X";
            }
            idx++;
        }

        return answer;
    }
}
