package Day17;

public class day17_1 {
    public static void main(String[] args) {
        System.out.println(solution(29183,1));
        System.out.println(solution(232443,4));
        System.out.println(solution(123456,7));
    }

    static int solution(int num, int k) {
        return ("."+num).indexOf(String.valueOf(k));
    }
}
