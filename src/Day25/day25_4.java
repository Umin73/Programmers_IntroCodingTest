package Day25;

public class day25_4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{2,4,8}));
    }

    static int solution(int[] common) {
        int firstGap = common[1] - common[0];
        int secondGap = common[2] - common[1];

        if(firstGap == secondGap) return common[common.length-1]+firstGap;
        else return common[common.length-1] * (common[1]/common[0]);
    }
}
