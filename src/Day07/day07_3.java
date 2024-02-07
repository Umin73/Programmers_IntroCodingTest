package Day07;

public class day07_3 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    static int solution(int n, int k) {
        return (12000*n)+(2000*k)-((n/10)*2000);
    }
}
