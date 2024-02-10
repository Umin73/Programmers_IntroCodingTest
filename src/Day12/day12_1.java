package Day12;

public class day12_1 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"	));
    }

    static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
