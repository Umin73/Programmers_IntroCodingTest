package Day20;

import java.util.Arrays;

public class day20_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}
                , new int[]{11,11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}
                , new int[]{7,9})));
    }

    static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0,0};

        for (String k:keyinput) {
            switch (k){
                case "up":
                    if(answer[1]+1 <= (board[1]/2))
                        answer[1]++;
                    break;
                case "down":
                    if(answer[1]-1 >= (board[1]/2)*-1)
                        answer[1]--;
                    break;
                case "left":
                    if(answer[0]-1 >= (board[0]/2)*-1)
                        answer[0]--;
                    break;
                case "right":
                    if(answer[0]+1 <= (board[0]/2))
                        answer[0]++;
                    break;
            }
        }
        return answer;
    }
}
