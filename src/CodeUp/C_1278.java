package CodeUp;

import java.util.Scanner;

//자릿수 계산
public class C_1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while(n > 0){
            n/=10;
            result += 1;
        }
        System.out.println(result);
    }
}
