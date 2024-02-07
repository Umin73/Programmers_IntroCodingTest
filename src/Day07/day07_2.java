package Day07;

public class day07_2 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }

    static int solution(int angle) {
        if(angle > 0 && angle < 90) return 1;
        if(angle == 90) return 2;
        if(angle > 90 && angle < 180) return 3;
        if(angle == 180) return 4;

        return -1;
    }
}
