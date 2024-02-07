package Day08;

public class day08_4 {
    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n%i == 0) answer++;
        }

        return answer;
    }
}
