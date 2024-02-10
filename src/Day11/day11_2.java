package Day11;

public class day11_2 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
