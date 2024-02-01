package Day04;

public class day04_3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));
    }

    static int solution(int slice, int n) {
        return n%slice == 0 ? n/slice : (n/slice)+1 ;
    }
}
