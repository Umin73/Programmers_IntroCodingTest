package Day21;

public class day21_1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        for (String s:str) {
            if(!s.equals("")) answer += Integer.parseInt(s);
        }
        return answer;
    }
}
