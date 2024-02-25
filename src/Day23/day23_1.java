package Day23;

import java.util.*;

public class day23_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6},4)));
        System.out.println(Arrays.toString(solution(new int[]{10000,20,36,47,40,6,10,7000},30)));
        System.out.println(Arrays.toString(solution(new int[]{1,4,5,11},5)));
        System.out.println(Arrays.toString(solution(new int[]{10,2},6)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5},1)));
        System.out.println(Arrays.toString(solution(new int[]{600, 400, 300, 200, 700, 800, 100, 900},500)));
    }

    static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new HashMap<>();    // key: numlist[i], value: n과의 차이
        for (int k:numlist) {
            map.put(k, Math.abs(n-k));
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int compare = map.get(o1).compareTo(map.get(o2));
                if(compare == 0) return o2.compareTo(o1);
                else return compare;
            }
        });

        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }

        return answer;
    }
}
