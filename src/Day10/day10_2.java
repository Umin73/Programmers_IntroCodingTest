package Day10;

public class day10_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
    }

    static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int length = num_list.length;

        for (int i = 0; i < length; i++) {
            answer[i/n][i%n] = num_list[i];
        }

        return answer;
    }
}
