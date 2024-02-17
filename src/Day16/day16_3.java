package Day16;

public class day16_3 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }

    static int solution(String my_string) {
        String[] calculation = my_string.split(" ");
        int answer = Integer.parseInt(calculation[0]);

        for (int i = 1; i < calculation.length; i+=2) {
            if(calculation[i].equals("+"))
                answer += Integer.parseInt(calculation[i+1]);
            if(calculation[i].equals("-"))
                answer -= Integer.parseInt(calculation[i+1]);
        }
        return answer;
    }
}
