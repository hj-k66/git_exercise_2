package week4.algorithm;

public class SumofDigit {
    public int solution(int n) {
        String s = String.valueOf(n);
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
    public static void main(String[] args) {
        SumofDigit sumofDigit = new SumofDigit();
        int result1 = sumofDigit.solution(123);

        if(result1==6){
            System.out.println("테스트 성공하셨습니다.");
        }else{
            System.out.println("테스트 실패하셨습니다.");
        }

    }
}
