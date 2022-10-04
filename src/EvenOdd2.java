import java.util.Scanner;

public class EvenOdd2 {
    private static String getEvenOdd(int num){
        if(num%2==0) {
            return "짝수";
        }
        else{
            return "홀수";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%s+%s=%s", getEvenOdd(num1), getEvenOdd(num2), getEvenOdd(num1 + num2));
    }
}
