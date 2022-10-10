package CodeUp;

import java.util.Scanner;

public class C_1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        //n1,n2를 합하면 int범위를 넘어가므로 long
        System.out.println(n1+n2);
    }
}
