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
    void printSquareByRepeat(int n){
        for(int i = 0; i < n;i++){
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SquareStar squareStar = new SquareStar();
//        squareStar.printSquareMatrix(n);
        squareStar.printSquareByRepeat(n);
    }
}
