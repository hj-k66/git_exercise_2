package week3.Class_1005.DICalculator;


public class Main {
    public static void main(String[] args) {
        Calculator randomCalculator= new Calculator(new RandomNumGenerator());
        randomCalculator.plus(10);

        Calculator specificCalculator = new Calculator(new SpecificNumGenerator());
        specificCalculator.plus(20);

        Calculator bypassCalculator = new Calculator(new ByPassNumGenerator(), 50000);
        bypassCalculator.plus(100);
    }
}
