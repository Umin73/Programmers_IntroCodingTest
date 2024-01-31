package Day02;

public class day02_1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }

    static int solution(int num1, int num2) {
        return (int)(((double)num1/(double)num2) * 1000);
    }
}
