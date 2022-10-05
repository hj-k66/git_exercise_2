package Class_1005.DICalculator;


public class Main {
    public static void main(String[] args) {
        Calculator randomCalculator= new Calculator(new RandomNumGenerator());
        randomCalculator.plus();

        Calculator specificCalculator = new Calculator(new SpecificNumGenerator());
        specificCalculator.plus();
    }
}
