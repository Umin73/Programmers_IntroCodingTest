package Day23;

import java.util.Arrays;

public class day23_3 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    static int solution(String[] babbling) {
        String[] pronunciation = new String[]{ "aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String p:pronunciation) {
                if(babbling[i].contains(p))
                    babbling[i] = babbling[i].replace(p,".");
            }
        }

        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("."))
                babbling[i] = babbling[i].replace(".","");
        }

        return (int)Arrays.stream(babbling).filter(s -> s.equals("")).count();
    }
}
