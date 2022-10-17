package week5.algorithm;

import java.util.Scanner;

public class RightTriangle {
    public void NRigntTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
        *   i = 0 별이 1개
        **  i = 1 별이 2개
        *** i = 2 별이 3개
        **** i = 3 별이 4개
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.NRigntTriangle(n);

    }
}
