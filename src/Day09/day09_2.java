package Day09;

public class day09_2 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"	));
        System.out.println(solution(".--. -.-- - .... --- -."	));
    }

    static String solution(String letter) {
        String answer = "";
        String[] splitLetter = letter.split(" ");
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-."
                ,"--.","....","..",".---","-.-",".-..","--","-.","---"
                ,".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String s:splitLetter) {
            for (int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])) answer+= alphabet.charAt(i);
            }
        }

        return answer;
    }
}
