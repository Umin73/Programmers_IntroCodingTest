package Day08;

public class day08_2 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String s_age = String.valueOf(age);
        char c = 'a';

        for (char a: s_age.toCharArray()) {
            c = 'a';
            for (int i = 0; i < Integer.parseInt(String.valueOf(a)); i++) c++;
            sb.append(c);
        }
        return sb.toString();
    }
}
