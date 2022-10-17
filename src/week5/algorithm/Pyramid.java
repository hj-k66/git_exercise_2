package week5.algorithm;

public class Pyramid {
    public void printPyramid(int n){
        for(int i = 0; i < n; i++){
            //공백
            for(int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }
            //별
            for(int k = 0; k <= 2*i; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printPyramid(4);
    }
}
