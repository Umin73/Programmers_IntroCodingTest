package Day10;

public class day10_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4},2));
        System.out.println(solution(new int[]{1,2,3,4,5,6},5));
        System.out.println(solution(new int[]{1,2,3},3));
    }

    static int solution(int[] numbers, int k) {
        int idx = 0;
        int cnt = 1;

        while (cnt < k) {
            if(idx+2 < numbers.length) idx+=2;
            else{
                if(idx+1 == numbers.length) idx = 1;
                else idx = 0;
            }
            cnt++;
        }
        return numbers[idx];
    }
}
