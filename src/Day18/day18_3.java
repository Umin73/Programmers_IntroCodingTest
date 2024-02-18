package Day18;

public class day18_3 {
    public static void main(String[] args) {
        System.out.println(solution(2,10));
        System.out.println(solution(7,15));
    }

    static int solution(int n, int t) {
       return (int) (n * Math.pow(2,t));
    }
}
