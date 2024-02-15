package Day13;

public class day13_3 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char c:my_string.toCharArray()) {
            if(sb.indexOf(String.valueOf(c)) == -1)
                sb.append(c);
        }

        return sb.toString();
    }
}
