package Day22;

public class day22_1 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            ++answer;
            while (answer%3 == 0 || String.valueOf(answer).contains("3")){
                ++answer;
            }
        }
        return answer;
    }
}
