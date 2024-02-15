package Day14;

public class day14_2 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }

    static int solution(int order) {
        int cnt = 0;
        while (order > 0) {
            if(order%10 == 3 || order%10 == 6 || order%10 == 9) cnt++;
            order /= 10;
        }
        return cnt;
    }
}
