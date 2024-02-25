package Day23;

import java.util.Arrays;

public class day23_3 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    static int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = new String[]{ "aya", "ye", "woo", "ma"};
        int[] check = new int[4];

        for (String b:babbling) {
            while (true) {
                for (int i = 0; i < pronunciation.length; i++) {
                    if(b.length() >= pronunciation[i].length()) {
                        if(b.substring(0,pronunciation[i].length()).equals(pronunciation[i])){
                            check[i]++;
                        }
                    }
                }
            }
        }

        return (int)Arrays.stream(check).filter(v -> v>0).count();
    }
}
