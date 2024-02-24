package Day22;

public class day22_4 {
    public static void main(String[] args) {
        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));
    }

    static int solution(int a, int b) {
        // 1. 기약분수로 만들기
        int molecular = a;
        int denominator = b;
        for (int i = Math.max(a,b); i >= 2; i--) {
            if(molecular%i == 0 && denominator%i == 0) {
                molecular /= i;
                denominator /= i;
            }
        }

        // 2. 분모가 2 또는 5로만 나눠지는지 확인하기
        while (denominator > 1) {
            if(denominator%2 != 0 && denominator%5 != 0) return 2;
            else {
                if(denominator%2 == 0) denominator /= 2;
                else if(denominator%5 == 0) denominator /= 5;
            }
        }
        return 1;
    }
}
