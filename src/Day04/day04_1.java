package Day04;

public class day04_1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    static int solution(int n) {
        return n%7==0 ? n/7 : n/7+1;
    }
}
