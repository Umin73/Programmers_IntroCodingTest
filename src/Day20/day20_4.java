package Day20;

public class day20_4 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("9 + 16x + 15x + 9"));
        System.out.println(solution("1"));
        System.out.println(solution("x"));
    }

    static String solution(String polynomial) {
        String answer = "";
        String[] calc = polynomial.split(" ");
        int xVal = 0;
        int num = 0;

        for (String s:calc) {
            if(s.contains("x")){
                if(s.length()==1) xVal++;
                else xVal += Integer.parseInt(s.substring(0,s.length()-1));
            }
            else if(!s.equals("+")) num += Integer.parseInt(s);
        }

        // num이 0인 경우 x가 0인 경우, x가 1인 경우 고려해야 함
        if(xVal > 1){
            answer += xVal + "x";
            if(num != 0){
                   answer += " + " + num;
            }
        }
        else if(xVal == 1){
            answer += "x";
            if(num != 0) {
                answer += " + " + num;
            }
        }
        else if(xVal == 0){
            if(num != 0) {
                answer += num;
            }
        }
        return answer;
    }
}
