package Day14;

public class day14_4 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char c:my_string.toCharArray()) {
            if(Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
