package Day07;

public class day07_1 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef","f"));
        System.out.println(solution("BCBdbe","B"));
    }

    static String solution(String my_string, String letter) {
        return my_string.replace(letter,"");
    }
}
