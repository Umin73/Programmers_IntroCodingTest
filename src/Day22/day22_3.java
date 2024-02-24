package Day22;

import java.util.HashMap;
import java.util.Map;

public class day22_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,1},{2,5},{3,9}}));
        System.out.println(solution(new int[][]{{-1,1},{1,3},{3,9}}));
        System.out.println(solution(new int[][]{{0,5},{3,9},{1,10}}));
    }

    static int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] line:lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.merge(i,1,Integer::sum);
            }
        }

        return (int)map.values().stream().filter(v -> v>1).count();
    }
}
