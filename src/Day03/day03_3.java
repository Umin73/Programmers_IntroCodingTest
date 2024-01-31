package Day03;

public class day03_3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));
    }

    static int solution(int slice, int n) {
        int answer = 1;
        while (slice*answer < n) answer++;
        return answer;
    }
}
