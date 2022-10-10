package CodeUp;

import java.util.Scanner;

public class C_1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //String에서 8진수 정수로 변환
        int n = Integer.parseInt(s,8);
        System.out.printf("%d", n);
    }
}
