package Day20;

public class day20_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,1},{2,1},{2,2},{1,2}}));
        System.out.println(solution(new int[][]{{-1,-1},{1,1},{1,-1},{-1,1}}));
    }

    static int solution(int[][] dots) {
        int xMin = 256;
        int xMax = -256;
        int yMin = 256;
        int yMax = -256;

        for (int i = 0; i < dots.length; i++) {
            if(dots[i][0] < xMin) xMin = dots[i][0];
            if(dots[i][0] > xMax) xMax = dots[i][0];
            if(dots[i][1] < yMin) yMin = dots[i][1];
            if(dots[i][1] > yMax) yMax = dots[i][1];
        }
        return Math.abs(xMax - xMin)*Math.abs(yMax-yMin);
    }
}
