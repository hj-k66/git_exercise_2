import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int i = 0; i < unit.length; ++i) {
            int num = money / unit[i];
            System.out.println(unit[i] + "원" + num + "개");
            money -= unit[i] * num;
        }
    }
}
