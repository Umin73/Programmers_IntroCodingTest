package Day13;

public class day13_1 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    static int solution(String s) {
        int answer = 0;
        String[] numbers = s.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].equals("Z")) answer -= Integer.parseInt(numbers[i-1]);
            else answer += Integer.parseInt(numbers[i]);
        }

        return answer;
    }
}
