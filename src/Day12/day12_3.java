package Day12;

public class day12_3 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    static int solution(String my_string) {
        int answer = 0;
        for (char n:my_string.replaceAll("[a-z,A-Z]", "").toCharArray()) {
            answer += (n - '0');
        }
        return answer;
    }
}
