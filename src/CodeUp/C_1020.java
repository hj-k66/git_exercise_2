package CodeUp;

import java.util.Scanner;

public class C_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("[-\n]");
        int front = sc.nextInt();
        int back = sc.nextInt();
        System.out.printf("%06d%07d", front, back);
    }
}
