package Day06;

public class day06_4 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c:my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}
