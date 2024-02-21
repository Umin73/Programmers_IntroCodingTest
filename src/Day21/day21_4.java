package Day21;

public class day21_4 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    static int solution(String[] spell, String[] dic) {
        boolean flag = false;
        for (String d:dic) {
            for (String s:spell) {
                if(!d.contains(s)) {
                    flag = false;
                    break;
                }
                else flag = true;
            }
            if(flag) return 1;
        }
        return 2;
    }
}
