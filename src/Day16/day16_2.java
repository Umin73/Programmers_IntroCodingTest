package Day16;

public class day16_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,8,3}));
        System.out.println(solution(new int[]{9,10,11,8}));
    }

    static int[] solution(int[] array) {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        return new int[]{max, idx};
    }
}
