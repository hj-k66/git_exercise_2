package CodeUp;

import java.util.Scanner;

public class C_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //String 16진수로 바꾸기
        int num = Integer.parseInt(s,16);
        System.out.printf("%o", num);
    }
}
