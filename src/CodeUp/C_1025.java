package CodeUp;

import java.util.Scanner;

public class C_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] unit = {10000,1000,100,10,1};
        for(int i = 0; i < 5; i++){
            System.out.printf("[%d]\n", n/unit[i] * unit[i]);
            n %= unit[i];
        }
    }
}
