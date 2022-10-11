package week3.Class_1005.DICalculator;


public class SpecificNumGenerator implements NumberGenerator {
    //특정 숫자 생성:2000을 곱한 값
    @Override
    public int generate(int num) {
        return 2000*num;
    }
}
