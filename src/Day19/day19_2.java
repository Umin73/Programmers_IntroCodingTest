package Day19;

import java.util.ArrayList;

public class day19_2 {
    public static void main(String[] args) {
        System.out.println(solution("abc1Addfggg4556b",6));
        System.out.println(solution("abcdef123",3));
    }

    static ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        while (my_str.length() > 0) {
            if(my_str.length() >= n){
                answer.add(my_str.substring(0,n));
                my_str = my_str.substring(n);
            }
            else{
                answer.add(my_str);
                my_str = "";
            }
        }
        return answer;
    }
}
