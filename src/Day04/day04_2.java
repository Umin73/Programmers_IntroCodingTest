package Day04;

public class day04_2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    static int solution(int n) {
        int answer = 1;
        while ((answer*6)%n != 0) {answer++;}
        return answer;
    }
}
