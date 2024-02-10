package Day11;

public class day11_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1},1));
        System.out.println(solution(new int[]{10,8,6},3));
    }

    static int solution(int[] box, int n) {
        return (box[0]/n)*(box[1]/n)*(box[2]/n);
    }
}
