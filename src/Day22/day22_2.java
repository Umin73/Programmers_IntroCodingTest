package Day22;

import java.util.Arrays;

public class day22_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,4},{9,2},{3,8},{11,6}}));    // 1
        System.out.println(solution(new int[][]{{3,5},{4,1},{2,4},{5,10}}));    // 0
        System.out.println(solution(new int[][]{{1,2},{5,1},{3,6},{6,3}}));     // 1
        System.out.println(solution(new int[][]{{10,1},{9,3},{2,2},{4,4}}));    // 0
    }

    static int solution(int[][] dots) {
        int a_h;
        int a_w;
        int b_h;
        int b_w;
        double a_grade;
        double b_grade;
        Arrays.sort(dots, (x1, x2)->{
            return x1[0]-x2[0];
        });
        a_h = Math.abs(dots[1][1]-dots[0][1]);
        a_w = Math.abs(dots[1][0]- dots[0][0]);
        b_h = Math.abs(dots[3][1]-dots[2][1]);
        b_w = Math.abs(dots[3][0]-dots[2][0]);
        if(a_h > a_w) {
            a_grade = a_h/a_w;
            b_grade = b_h/b_w;
        }
        else {
            a_grade = a_w/a_h;
            b_grade = b_w/b_h;
        }
        if(a_grade == b_grade) return 1;

        Arrays.sort(dots, (y1, y2) -> {
            return y1[1]-y2[1];
        });
        a_h = Math.abs(dots[1][1]-dots[0][1]);
        a_w = Math.abs(dots[1][0]- dots[0][0]);
        b_h = Math.abs(dots[3][1]-dots[2][1]);
        b_w = Math.abs(dots[3][0]-dots[2][0]);
        if(a_h > a_w) {
            a_grade = a_h/a_w;
            b_grade = b_h/b_w;
        }
        else {
            a_grade = a_w/a_h;
            b_grade = b_w/b_h;
        }
        if(a_grade == b_grade) return 1;

        return 0;
    }
}
