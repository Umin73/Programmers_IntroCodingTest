package Day09;

public class day09_1 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    static int solution(int hp) {
        int answer = 0;
        int[] militaryAntList = new int[]{5, 3, 1};
        int m_idx = 0;

        while (hp > 0) {
            if(hp>=militaryAntList[m_idx]) {
                hp-=militaryAntList[m_idx];
                answer++;
            }
            else m_idx++;
        }

        return answer;
    }
}
