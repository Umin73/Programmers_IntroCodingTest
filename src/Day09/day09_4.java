package Day09;

public class day09_4 {
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(5,3));
        System.out.println(solution(30,10));
    }

    static int solution(int balls, int share) {
        if(balls == share) return 1;
        return (int)(Factorial(balls, (balls-share+1)) / Factorial(share, 1));
    }

    static double Factorial(int num, int end){
        if(num <= end) return end;
        else return (num * Factorial(num-1, end));
    }
}
