package Day14;

public class day14_3 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk",4));
        System.out.println(solution("pfqallllabwaoclk",2));
    }

    static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = code-1; i < cipher.length(); i+=code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}
