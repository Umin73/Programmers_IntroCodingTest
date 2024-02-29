package Day25;

public class day25_1 {
    public static void main(String[] args) {
        System.out.println(solution("hello","ohell"));
        System.out.println(solution("apple","elppa"));
        System.out.println(solution("atat","tata"));
        System.out.println(solution("abc","abc"));
    }

    static int solution(String A, String B) {
        int answer = 0;
        char last;
        String moved = A;

        while (!moved.equals(B) && answer < A.length()) {
            last = moved.charAt(moved.length()-1);
            moved = last + moved.substring(0, moved.length()-1);
            answer++;

            if(moved.equals(B)) break;
        }

        return (answer >= A.length() ? -1 : answer);
    }
}
