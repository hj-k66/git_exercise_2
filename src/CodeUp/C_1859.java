package CodeUp;

import java.util.Scanner;

public class C_1859 {
    void printRow(int k){
        if(k<=0){
            return;
        }
        System.out.printf("*");
        printRow(k-1);

    }

    void printStar(int k){
        if(k<=0){
            return;
        }
        printStar(k-1);
        printRow(k);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        C_1859 c = new C_1859();
        c.printStar(n);
    }
}
