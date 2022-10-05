package CodeUp;

import java.util.Scanner;

public class C_1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("[.\n]");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.printf("%04d.%02d.%02d", year, month,day);
    }
}
