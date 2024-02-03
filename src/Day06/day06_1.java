package Day06;

public class day06_1 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder().append(my_string);
        sb.reverse();
        return sb.toString();
    }
}
