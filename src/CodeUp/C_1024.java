package CodeUp;

import java.util.Scanner;

public class C_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++){
            System.out.printf("\'%s\'\n", word.charAt(i));
        }
    }
}
