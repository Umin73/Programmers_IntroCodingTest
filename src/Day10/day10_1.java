package Day10;

public class day10_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }

    static int solution(int[] dot) {
        if(dot[0] < 0)  {
            if(dot[1] < 0) return 3;
            else return 2;
        }
        else{
            if(dot[1] < 0) return 4;
            else return 1;
        }
    }
}
