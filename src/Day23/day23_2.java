package Day23;

import java.util.*;

public class day23_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80,70},{90,50},{40,70},{50,80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80,70},{70,80},{30,50}
                ,{90,100},{100,90},{100,100},{10,30}})));
        System.out.println(Arrays.toString(solution(new int[][]{{1,1},{1,2}})));
    }

    static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        Map<Integer, Integer> map = new HashMap<>();    // key: 인덱스(학생번호), value: 총점수(평균대신)
        for (int i = 0; i < score.length; i++) {
            map.put(i, score[i][0]+score[i][1]);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(((o1, o2) -> map.get(o2).compareTo(map.get(o1))));

        for (int key:keySet) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

        int ranking = 1;
        int pass = 0;
        for (int i = 0; i < keySet.size(); i++) {
            answer[keySet.get(i)] = ranking;
            if(i+1 < keySet.size()){
                if(map.get(keySet.get(i+1)).equals(map.get(keySet.get(i)))) {
                    pass++;
                }
                else {
                    ranking += (1+pass);
                    pass = 0;
                }
            }
        }

        return answer;
    }
}
