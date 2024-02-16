package Day15;

public class day15_3 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];

        for (char c:s.toCharArray()) {
            int idx = c - 'a';
            cnt[idx]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 1) sb.append((char)(i+'a'));
        }
        return sb.toString();
    }
}
