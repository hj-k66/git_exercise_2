package week5.algorithm;

import java.util.Scanner;

public class RectangleStar {
    void printRectangle(int x, int y){
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RectangleStar rs = new RectangleStar();
        rs.printRectangle(3,5);
    }
}
