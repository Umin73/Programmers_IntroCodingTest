package Day02;

public class day02_3 {
    public static void main(String[] args) {
        System.out.println(solution(1,2,3,4));
        System.out.println(solution(9,2,1,3));
        System.out.println(solution(4,4,4,4));
        System.out.println(solution(1,8,2,16));
    }

    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);

        int divNum = 1;
        for (int i = 2; i <=  denom1 * denom2; i++) {
                if(numer % i == 0 && denom % i == 0) divNum=i;
        }
        denom /= divNum;
        numer /= divNum;
        System.out.println("divNum은 " + divNum);
        System.out.println(numer + ", " + denom);

        return new int[]{numer, denom};
    }
}
