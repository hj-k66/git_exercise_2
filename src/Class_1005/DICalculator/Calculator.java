package Class_1005.DICalculator;


public class Calculator {
    NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(){
        System.out.println(10+numberGenerator.generate(10));
    }

}
