package Day24;

public class day24_3 {
    public static void main(String[] args) {
        System.out.println(solution("olleh","hello"));
        System.out.println(solution("allpe","apple"));
    }

    static int solution(String before, String after) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for (char c:before.toCharArray()) {
            cnt1[c-'a']++;
        }

        for (char c:after.toCharArray()) {
            cnt2[c-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(cnt1[i] != cnt2[i]) return 0;
        }
        return 1;
    }
}
