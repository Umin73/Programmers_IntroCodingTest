package Day21;

public class day21_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2}));
        System.out.println(solution(new int[]{3,6}));
        System.out.println(solution(new int[]{11,7}));
    }

    static int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int s = 0;

        // case 1 : sides 에 가장 가장 긴 변이 있는 경우
        max = Math.max(sides[0], sides[1]);
        s = Math.min(sides[0], sides[1]);
        for (int i = max-s+1; i <= max ; i++) answer++;

        // case 2: 또 다른 변의 길이가 가장 긴 경우
        for (int i = max+1; i < sides[0]+sides[1] ; i++) answer++;
        
        return answer;
    }
}
