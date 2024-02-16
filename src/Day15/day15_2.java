package Day15;

public class day15_2 {
    public static void main(String[] args) {
        System.out.println(solution("hello",1,2));
        System.out.println(solution("I love you",3,6));
    }

    static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char ch1 = my_string.charAt(num1);
        char ch2 = my_string.charAt(num2);
        sb.setCharAt(num1, ch2);
        sb.setCharAt(num2, ch1);
        return sb.toString();
    }
}
