package Day02;

public class day02_2 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }

    static int solution(int num1, int num2) {
        return (num1==num2 ?  1 : -1);
    }
}
