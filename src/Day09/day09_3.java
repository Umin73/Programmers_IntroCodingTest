package Day09;

public class day09_3 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    static String solution(String rsp) {
        String answer = "";
        String[] rspList = rsp.split("");

        for (String now:rspList) {
            switch (now){
                case "2":
                    answer += "0";
                    break;
                case "0":
                    answer += "5";
                    break;
                case "5":
                    answer += "2";
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}
