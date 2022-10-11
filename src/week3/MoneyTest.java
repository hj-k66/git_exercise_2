package week3;

import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();

        System.out.printf("50000원권 %d장, 나머지 : %d\n", (money/50000), money%50000);
        money  = money % 50000;
        System.out.printf("10000원권 %d장, 나머지 : %d\n", (money/10000), money%10000);
        money  = money % 10000;
        System.out.printf("5000원권 %d장, 나머지 : %d\n", (money/5000), money%5000);
        money  = money % 5000;
        System.out.printf("1000원권 %d장, 나머지 : %d\n", (money/1000), money%1000);
        money  = money % 1000;
        System.out.printf("500원권 %d개, 나머지 : %d\n", (money/500), money%500);
        money  = money % 500;
        System.out.printf("100원권 %d개, 나머지 : %d\n", (money/100), money%100);
        money  = money % 100;
        System.out.printf("50원권 %d개, 나머지 : %d\n", (money/50), money%50);
        money  = money % 50;
        System.out.printf("10원권 %d개, 나머지 : %d\n", (money/10), money%10);
        money  = money % 10;


    }
}
