package Day24;

public class day24_1 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    static int solution(int chicken) {
        int coupon = chicken;
        int answer = 0;

        while (coupon >= 10) {
            chicken = coupon / 10;
            coupon = (coupon % 10) + chicken;
            answer += chicken;
        }

        return answer;
    }
}
