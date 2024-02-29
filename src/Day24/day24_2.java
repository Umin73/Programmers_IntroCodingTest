package Day24;

public class day24_2 {
    public static void main(String[] args) {
        System.out.println(solution("10","11"));
        System.out.println(solution("1001","1111"));
        System.out.println(solution("0101","1011"));
        System.out.println(solution("0","0"));
        System.out.println(solution("1111111111","1111111111"));
        System.out.println(solution("1001","1"));
    }

    static String solution(String bin1, String bin2) {

        // 삽질한 풀이.....
       /* int maxLength = Math.max(bin1.length(), bin2.length());
        char[] arr_bin1 = new char[maxLength];
        char[] arr_bin2 = new char[maxLength];
        char[] answer = new char[arr_bin1.length+1];
        int tmp = 0;
        int a = 0;
        int b = 0;

        int idx = bin1.length()-1;
        for (int i = maxLength-1; i >= 0 ; i--) {
            if(i >= maxLength- bin1.length())
                arr_bin1[i] = bin1.toCharArray()[idx--];
            else arr_bin1[i] = '0';
        }

        idx = bin2.length()-1;
        for (int i = maxLength-1; i >= 0; i--) {
            if(i >= maxLength- bin2.length())
                arr_bin2[i] = bin2.toCharArray()[idx--];
            else arr_bin2[i] = '0';
        }

        for (int i = arr_bin1.length-1; i >= 0 ; i--) {
            a = Integer.parseInt(String.valueOf(arr_bin1[i]));
            b = Integer.parseInt(String.valueOf(arr_bin2[i]));
            if((a+b+tmp) == 0) {
                answer[i+1] = '0';
                tmp = 0;
            }
            else if((a+b+tmp) == 1) {
                answer[i+1] = '1';
                tmp = 0;
            }
            else if((a+b+tmp) == 2) {
                answer[i+1] = '0';
                tmp = 1;
            }
            else if((a+b+tmp) == 3) {
                answer[i+1] = '1';
                tmp = 1;
            }
        }
        if(tmp == 1) answer[0] = '1';

        if (tmp == 1) return String.valueOf(answer);
        else return String.valueOf(answer).substring(1);*/

        // Integer클래스의 parseInt 이용
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2,2),2);
    }
}
