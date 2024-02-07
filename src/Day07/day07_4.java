package Day07;

public class day07_4 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i+=2) answer+=i;
        return answer;
    }
}
