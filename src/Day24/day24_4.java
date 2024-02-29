package Day24;

public class day24_4 {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
        System.out.println(solution(10,50,5));
        System.out.println(solution(3,10,2));
    }

    static int solution(int i, int j, int k) {
        int answer = 0;
        int tmp = 0;

        for (int l = i; l <= j ; l++) {
            if(String.valueOf(l).contains(String.valueOf(k))){
                tmp = l;
                while (tmp != 0) {
                    if(tmp%10 ==k) answer++;
                    tmp/=10;
                }
            }
        }

        return answer;
    }
}
