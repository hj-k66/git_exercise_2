package Class_1005.DICalculator;


public class Calculator {
    //numberGenerator로 만든 숫자를 가지고
    // 사칙연산 결과 출력
    private NumberGenerator numberGenerator;
    private int baseNum=10;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    //baseNum에 Generate한 숫자 더하기
    public void plus(int num){
        System.out.println( baseNum + numberGenerator.generate(num));
    }

}
