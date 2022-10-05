package CodeUp;

import java.util.Scanner;

public class C_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.next()).useDelimiter(":");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        System.out.printf("%d:%d", hour,minute);
    }
}
