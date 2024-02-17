package Day16;

public class day16_1 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    static int solution(String message) {
        return message.length()*2;
    }
}
