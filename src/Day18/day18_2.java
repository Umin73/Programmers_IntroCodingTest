package Day18;

public class day18_2 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    static int solution(int n) {
        return (n % Math.sqrt(n) == 0) ? 1 : 2;
    }
}
