package Day11;

public class day11_4 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    static int solution(int n) {
        int facto = 1;
        int i = 1;
        while (facto*(i+1) <= n) {
            facto *= ++i;
        }
        return i;
    }
}
