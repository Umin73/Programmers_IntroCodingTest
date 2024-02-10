package Day12;

import java.util.ArrayList;

public class day12_4 {
    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(17));
        System.out.println(solution(420));
    }

    static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            if(n%i==0 && isPrimeNum(i)) answer.add(i);
        }
        return answer;
    }

    static boolean isPrimeNum(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
