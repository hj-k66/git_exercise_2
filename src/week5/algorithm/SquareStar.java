package week5.algorithm;

import java.util.Scanner;

public class SquareStar {
    void printSquareMatrix(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squareStar.printSquareMatrix(n);

    }
}
