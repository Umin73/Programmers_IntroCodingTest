package Day21;

import java.util.Arrays;

public class day21_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},{0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},{0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1}}));
    }

    static int solution(int[][] board) {
        int[][] newBoard = new int[board.length+2][board[0].length+2];
        int answer = 0;

        for (int i = 1; i < newBoard.length-1; i++) {
            for (int j = 1; j < newBoard[i].length-1; j++) {
                newBoard[i][j] = board[i-1][j-1];
            }
        }

        for (int i = 1; i < newBoard.length-1; i++) {
            for (int j = 1; j < newBoard[i].length-1; j++) {
                if(newBoard[i+1][j-1]!=1 && newBoard[i+1][j]!=1 && newBoard[i+1][j+1]!=1
                && newBoard[i][j-1]!=1 && newBoard[i][j+1]!=1
                && newBoard[i-1][j-1]!=1 && newBoard[i-1][j]!=1 && newBoard[i-1][j+1]!=1
                && newBoard[i][j] != 1)
                    newBoard[i][j] = 2;    // board 에 2라고 표시되어 있다면 안전지역
            }
        }

        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[i].length; j++) {
                if(newBoard[i][j] == 2) answer++;
            }
        }

        return answer;
    }
}
