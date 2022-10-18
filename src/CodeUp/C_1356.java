package CodeUp;

import java.util.Scanner;

public class C_1356 {
    void printRectangle(int n){
        for(int i = 0; i < n; i++){
            if(i==0 || i ==n-1){
                for(int j = 0; j < n; j++){
                    System.out.printf("*");
                }
            }
            else{
                String str = "";
                for(int k = 0; k < n-2; k++){
                    str += " ";
                }
                System.out.printf("*" + str + "*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        C_1356 c = new C_1356();
        c.printRectangle(n);
    }
}
