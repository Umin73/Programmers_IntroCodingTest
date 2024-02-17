package Day16;

public class day16_4 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }

    static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String a:s1) {
            for (String b:s2) {
                if(a.equals(b)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
