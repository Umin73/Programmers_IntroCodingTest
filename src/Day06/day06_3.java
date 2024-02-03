package Day06;

public class day06_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{1, 3, 5, 7}));
    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int n:num_list) {
            answer[n%2]++;
        }
        return answer;
    }
}
