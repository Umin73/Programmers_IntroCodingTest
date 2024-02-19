package Day19;

public class day19_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,77,17}));
        System.out.println(solution(new int[]{10,29}));
    }

    static int solution(int[] array) {
        int answer = 0;
        for (int a:array) {
            while (a>0){
                if(a%10 == 7) answer++;
                a /= 10;
            }
        }
        return answer;
    }
}
