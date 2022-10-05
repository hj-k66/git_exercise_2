package Class_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        RandomCalculator calculator = new RandomCalculator(10);
        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiple());
        System.out.println(calculator.divide());
    }
}
